package gm.zona_fit.gui;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

@Component
public class ZonaFitForma extends JFrame
{
    private JPanel     panelPrincipal;
    private JTable     clientesTabla;
    private JTextField nombreTexto;
    private JTextField apellidoTexto;
    private JTextField membresiaTexto;
    private JButton    guardarButton;
    private JButton    eliminarButton;
    private JButton    limpiarButton;
    IClienteServicio clienteServicio;
    private DefaultTableModel tablaModeloClientes;
    private Integer           idCliente;

    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio)
    {
        this.clienteServicio = clienteServicio;
        iniciarForma();
        guardarButton.addActionListener(e -> guardarCliente());
        clientesTabla.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);
                cargarClienteSeleccionado();
            }
        });
        eliminarButton.addActionListener(e -> eliminarCliente());
        limpiarButton.addActionListener(e -> limpiarFormulario());
    }

    private void iniciarForma()
    {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null); // Centra la ventana
    }

    private void createUIComponents()
    {
        // tablaModeloClientes = new DefaultTableModel(0, 4);
        tablaModeloClientes = new DefaultTableModel(0, 4)
        {
            // Evitamos la edicion de los valores de las celdas
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        String[] cabeceros = {
            "Id",
            "Nombre",
            "Apellido",
            "Membresia"
        };
        tablaModeloClientes.setColumnIdentifiers(cabeceros);
        clientesTabla = new JTable(tablaModeloClientes);
        // Restringimos la seleccion de la tabla a un solo registro
        clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Cargar el listado de clientes
        listarClientes();
    }

    private void listarClientes()
    {
        tablaModeloClientes.setRowCount(0);
        List<Cliente> clientes = clienteServicio.listarClientes();
        clientes.forEach(cliente -> {
            Object[] renglonCliente = {
                cliente.getId(),
                cliente.getNombre(),
                cliente.getApellido(),
                cliente.getMembresia()
            };
            tablaModeloClientes.addRow(renglonCliente);
        });
    }

    private void guardarCliente()
    {
        if (nombreTexto.getText().equals(""))
        {
            mostrarMensaje("Proporciona un nombre");
            nombreTexto.requestFocusInWindow();
            return;
        }
        if (membresiaTexto.getText().equals(""))
        {
            mostrarMensaje("Proporciona una membresia");
            membresiaTexto.requestFocusInWindow();
            return;
        }
        // Recuperamos los valores del formulario
        String nombre    = nombreTexto.getText();
        String apellido  = apellidoTexto.getText();
        int    membresia = Integer.parseInt(membresiaTexto.getText());

        Cliente cliente = new Cliente(idCliente, nombre, apellido, membresia);
        clienteServicio.guardarCliente(cliente); // Inserta/Modifica Cliente
        if (idCliente == null) mostrarMensaje("Se agrego el nuevo Cliente");
        else mostrarMensaje("Se Actualizo el Cliente");

        limpiarFormulario();
        listarClientes();
    }

    private void cargarClienteSeleccionado()
    {
        int fila = clientesTabla.getSelectedRow();
        if (fila == -1) return;

        String id = clientesTabla.getModel().getValueAt(fila, 0).toString();
        idCliente = Integer.parseInt(id);
        String nombre    = clientesTabla.getModel().getValueAt(fila, 1).toString();
        String apellido  = clientesTabla.getModel().getValueAt(fila, 2).toString();
        String membresia = clientesTabla.getModel().getValueAt(fila, 3).toString();

        nombreTexto.setText(nombre);
        apellidoTexto.setText(apellido);
        membresiaTexto.setText(membresia);
    }

    private void eliminarCliente()
    {
        int fila = clientesTabla.getSelectedRow();
        if (fila != -1)
        {
            String idClienteStr = clientesTabla.getModel().getValueAt(fila, 0).toString();
            idCliente = Integer.parseInt(idClienteStr);
            Cliente cliente = new Cliente();
            cliente.setId(this.idCliente);
            clienteServicio.eliminarCliente(cliente);
            mostrarMensaje("Cliente con id " + idCliente + " eliminado");
            listarClientes();
        }
        else mostrarMensaje("Debe Seleccionar un Cliente a eliminar");
    }

    private void limpiarFormulario()
    {
        nombreTexto.setText("");
        apellidoTexto.setText("");
        membresiaTexto.setText("");
        // Limpiar id de ciente seleccionado
        idCliente = null;
        // Deseleccionamos el registro seleccionado de la tabla
        clientesTabla.getSelectionModel().clearSelection();
    }

    private void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
