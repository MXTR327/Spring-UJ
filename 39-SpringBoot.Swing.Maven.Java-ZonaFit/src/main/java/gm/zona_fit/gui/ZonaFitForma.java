package gm.zona_fit.gui;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

@Component
public class ZonaFitForma extends JFrame
{
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    IClienteServicio clienteServicio;
    private DefaultTableModel tablaModeloClientes;

    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio)
    {
        this.clienteServicio = clienteServicio;
        iniciarForma();
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
        // TODO: place custom component creation code here
        tablaModeloClientes = new DefaultTableModel(0, 4);
        String[] cabeceros = {"Id", "Nombre", "Apellido", "Membresia"};
        tablaModeloClientes.setColumnIdentifiers(cabeceros);
        clientesTabla = new JTable(tablaModeloClientes);

        // Cargar el listado de clientes
        listarClientes();
    }

    private void listarClientes()
    {
        tablaModeloClientes.setColumnCount(0);
        List<Cliente> clientes = clienteServicio.listarClientes();
        clientes.forEach(cliente -> {
            Object[] renglonCliente = {cliente.getId(),
                                       cliente.getNombre(),
                                       cliente.getApellido(),
                                       cliente.getMembresia()
            };
            tablaModeloClientes.addRow(renglonCliente);
        });
    }
}
