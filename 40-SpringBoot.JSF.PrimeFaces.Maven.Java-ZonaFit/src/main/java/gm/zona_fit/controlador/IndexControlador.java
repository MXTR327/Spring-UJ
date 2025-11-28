package gm.zona_fit.controlador;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ViewScoped
public class IndexControlador
{
    @Autowired
    IClienteServicio clienteServicio;
    private              List<Cliente> clientes;
    private              Cliente       clienteSeleccionado;
    private static final Logger        logger = LoggerFactory.getLogger(IndexControlador.class);

    @PostConstruct
    public void init()
    {
        cargarDatos();
    }

    public void cargarDatos()
    {
        clientes = clienteServicio.listarClientes();
        clientes.forEach(cliente -> logger.info(cliente.toString()));
    }

    public void agregarCliente()
    {
        clienteSeleccionado = new Cliente();
    }

    public void guardarCliente()
    {
        logger.info("Cliente a guardar: " + clienteSeleccionado);
        // Agregar
        if (clienteSeleccionado.getId() == null)
        {
            clienteServicio.guardarCliente(this.clienteSeleccionado);
            clientes.add(clienteSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("ClienteAgregado"));
        }
        // Modificar (update)
        else
        {
            clienteServicio.guardarCliente(clienteSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage("Cliente Actualizado"));
        }
        // Ocultar la ventana modal
        PrimeFaces.current().executeScript("PF('ventanaModalCliente').hide()");
        // Actualizar la tabla usando ajax
        PrimeFaces.current().ajax().update("forma-clientes:mensajes",
                                           "forma-clientes:clientes-tabla");
        // Reset del objeto cliente seleccionado
        clienteSeleccionado = null;
    }

    public void eliminarCliente()
    {
        logger.info("Cliente a eliminar: " + clienteSeleccionado);
        clienteServicio.eliminarCliente(clienteSeleccionado);
        // Eliminar el registro del a lista de clientes
        clientes.remove(clienteSeleccionado);
        // Reset del objeto de cliente seleccionado
        clienteSeleccionado = null;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente Eliminado"));
        PrimeFaces.current().ajax().update("forma-clientes:mensajes",
                                           "forma-clientes:clientes-tabla");
    }
}
