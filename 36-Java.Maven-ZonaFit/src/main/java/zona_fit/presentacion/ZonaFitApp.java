package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.List;
import java.util.Scanner;

public class ZonaFitApp
{
    public static void main(String[] args)
    {
        zonaFitApp();
    }

    private static void zonaFitApp()
    {
        boolean salir = false;
        Scanner sc    = new Scanner(System.in);
        // Creamos un objeto de la clase clienteDAO,
        IClienteDAO clienteDAO = new ClienteDAO();

        while (!salir)
        {
            try
            {
                int opcion = mostrarMenu(sc);
                salir = ejecutarOpciones(sc, opcion, clienteDAO);
            }
            catch (Exception e)
            {
                System.out.println("Error al ejecutar opciones: " + e.getMessage());
            }
            System.out.println();
        }

    }

    private static int mostrarMenu(Scanner sc)
    {
        System.out.print("""
                             *** Zona Fit (GYM) ***
                             1. Listar Clientes
                             2. Buscar Cliente
                             3. Agregar Cliente
                             4. Modificar Cliente
                             5. Eliminar Cliente
                             6. Salir
                             Elije una opcion:\s""");
        return Integer.parseInt(sc.nextLine());
    }

    private static boolean ejecutarOpciones(Scanner sc, int opcion, IClienteDAO clienteDAO)
    {
        boolean salir = false;
        switch (opcion)
        {
            case 1 -> // 1. Listar Clientes
            {
                System.out.println("--- Listado de Clientes ---");
                List<Cliente> clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> // 2. Buscar cliente por Id
            {
                System.out.print("Introduce el id del Cliente a buscar: ");
                int     id         = Integer.parseInt(sc.nextLine());
                Cliente cliente    = new Cliente(id);
                boolean encontrado = clienteDAO.buscarClientePorId(cliente);
                if (encontrado)
                    System.out.println("Cliente encontrado: " + cliente);
                else
                    System.out.println("Cliente NO encontrado: " + cliente);
            }
            case 3 -> // 3. Agregar cliente
            {
                System.out.println("--- Agregar Cliente ---");
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Apellido: ");
                String apellido = sc.nextLine();
                System.out.print("Membresia: ");
                int membresia = Integer.parseInt(sc.nextLine());

                // Cremos el objeto cliente (sin el id)
                Cliente cliente  = new Cliente(nombre, apellido, membresia);
                boolean agregado = clienteDAO.agregarCliente(cliente);
                if (agregado)
                    System.out.println("Cliente agregado: " + cliente);
                else
                    System.out.println("Cliente NO agregado: " + cliente);
            }
            case 4 -> // 4. Modificar Cliente
            {
                System.out.println("--- Modificar Cliente ---");
                System.out.print("Id del cliente a modificar: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Nuevo Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Nuevo Apellido: ");
                String apellido = sc.nextLine();
                System.out.print("Nueva Membresia: ");
                int membresia = Integer.parseInt(sc.nextLine());

                // Creamos el objeto a modificar
                Cliente cliente    = new Cliente(id, nombre, apellido, membresia);
                boolean modificado = clienteDAO.modificarCliente(cliente);
                if (modificado)
                    System.out.println("Cliente modificado: " + cliente);
                else
                    System.out.println("Cliente NO modificado: " + cliente);
            }
            case 5 -> // 5. Eliminar Cliente
            {
                System.out.println("--- Eliminar Cliente ---");
                System.out.print("Id del cliente a eliminar: ");
                int id = Integer.parseInt(sc.nextLine());

                Cliente cliente   = new Cliente(id);
                boolean eliminado = clienteDAO.eliminarCliente(cliente);
                if (eliminado)
                    System.out.println("Cliente eliminado: " + cliente);
                else
                    System.out.println("Cliente NO eliminado: " + cliente);
            }
            case 6 -> // 6. Salir
            {
                System.out.println("Hasta pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion no reconocida: " + opcion);
        }
        return salir;
    }
}
