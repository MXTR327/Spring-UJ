package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

// @SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner
{
    @Autowired
    private IClienteServicio clienteServicio;

    private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

    String nl = System.lineSeparator();

    public static void main(String[] args)
    {
        logger.info("Iniciando la App");
        // Levantar la fabrica de spring
        SpringApplication.run(ZonaFitApplication.class, args);
        logger.info("Aplicacion Finalizada!");
    }

    @Override
    public void run(String... args) throws Exception
    {
        zonaFitApp();
    }

    private void zonaFitApp()
    {
        boolean salir = false;
        Scanner sc    = new Scanner(System.in);
        while (!salir)
        {
            int opcion = mostrarMenu(sc);
            salir = ejecutarOpciones(sc, opcion);
            logger.info(nl);
        }
    }

    private int mostrarMenu(Scanner sc)
    {
        logger.info(nl + nl);
        logger.info("""
                        *** Aplicacion Zona Fit (GYM) ***
                        1. Listar Clientes
                        2. Buscar Cliente
                        3. Agregar Cliente
                        4. Modificar Cliente
                        5. Eliminar Cliente
                        6. Salir
                        Elija una opcion:\s""");
        return Integer.parseInt(sc.nextLine());
    }

    private boolean ejecutarOpciones(Scanner sc, int opcion)
    {
        boolean salir = false;
        switch (opcion)
        {
            case 1 ->
            {
                logger.info(nl + "--- Listado de Clientes ---" + nl);
                List<Cliente> clientes = clienteServicio.listarClientes();
                clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
            }
            case 2 ->
            {
                logger.info(nl + "--- Buscar Cliente por Id ---" + nl);
                logger.info("Id Cliente a buscar: ");
                int     idCliente = Integer.parseInt(sc.nextLine());
                Cliente cliente   = clienteServicio.buscarClientePorId(idCliente);
                if (cliente != null)
                    logger.info("Cliente encontrado: " + cliente + nl);
                else
                    logger.info("Cliente NO encontrado: " + cliente + nl);
            }
            case 3 ->
            {
                logger.info("--- Agregar Estudiante ---" + nl);
                logger.info("Nombre: ");
                String nombre = sc.nextLine();
                logger.info("Apellido: ");
                String apellido = sc.nextLine();
                logger.info("Membresia: ");
                int     membresia = Integer.parseInt(sc.nextLine());
                Cliente cliente   = new Cliente();
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);
                cliente.setMembresia(membresia);
                clienteServicio.guardarCliente(cliente);
                logger.info("Cliente agregado: " + cliente + nl);
            }
            case 4 ->
            {
                logger.info("--- Modificar Cliente ---" + nl);
                logger.info("Id Cliente: ");
                int     idCliente = Integer.parseInt(sc.nextLine());
                Cliente cliente   = clienteServicio.buscarClientePorId(idCliente);
                if (cliente != null)
                {
                    logger.info("Nombre: ");
                    String nombre = sc.nextLine();
                    logger.info("Apellido: ");
                    String apellido = sc.nextLine();
                    logger.info("Membresia: ");
                    int membresia = Integer.parseInt(sc.nextLine());
                    cliente.setNombre(nombre);
                    cliente.setApellido(apellido);
                    cliente.setMembresia(membresia);
                    clienteServicio.guardarCliente(cliente);
                    logger.info("Cliente modificado: " + cliente + nl);
                }
                else
                    logger.info("Cliente NO encontrado: " + cliente + nl);
            }
            case 5 ->
            {
                logger.info("--- Eliminar Cliente ---" + nl);
                logger.info("Id Cliente: ");
                int     idCliente = Integer.parseInt(sc.nextLine());
                Cliente cliente   = clienteServicio.buscarClientePorId(idCliente);
                if (cliente != null)
                {
                    clienteServicio.eliminarCliente(cliente);
                    logger.info("Cliente eliminado: " + cliente + nl);
                }
                else
                    logger.info("Cliente NO encontrado: " + cliente + nl);
            }
            case 6 ->
            {
                logger.info("Hasta pronto!" + nl + nl);
                salir = true;
            }
            default -> logger.info("Opcion NO reconocida: " + opcion + nl);
        }
        return salir;
    }
}
