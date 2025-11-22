package maquina_snacks_archivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks
{
    public static void maquinaSnacks()
    {
        boolean salir = false;
        Scanner sc    = new Scanner(System.in);
        // Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();

        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks(); // Mostrar inventario de snacks disponibles

        while (!salir)
        {
            try
            {
                int opcion = mostrarMenu(sc);
                salir = ejecutarOpciones(opcion, sc, productos);
            }
            catch (Exception e)
            {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            finally
            {
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner sc)
    {
        System.out.print("""
                             Menu:
                             1. Comprar Snack
                             2. Mostrar ticket
                             3. Agregar Nuevo Snack
                             4. Salir
                             Elije una opcion:\s""");
        // Leemos y retornamos la opcion seleccionada por el usuario
        return Integer.parseInt(sc.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner sc, List<Snack> productos)
    {
        boolean salir = false;
        switch (opcion)
        {
            case 1 -> comprarSnack(sc, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(sc);
            case 4 ->
            {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opcion);
        }

        return salir;
    }

    private static void comprarSnack(Scanner sc, List<Snack> productos)
    {
        System.out.print("Que Snack quieres comprar (id)? ");
        int idSnack = Integer.parseInt(sc.nextLine());
        // Validar que el Snack exista en la lista de Snacks
        boolean snackEncontrado = false;
        for (Snack snack : Snacks.getSnacks())
        {
            if (idSnack == snack.getIdSnack())
            {
                // Agregamos a la lista de productos
                productos.add(snack);
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }

        if (!snackEncontrado)
            System.out.println("Id de Snack no encontrado: " + idSnack);
    }

    private static void mostrarTicket(List<Snack> productos)
    {
        StringBuilder ticket = new StringBuilder();
        double        total  = 0;
        ticket.append("*** Ticket de Venta ***");
        for (var producto : productos)
        {
            ticket.append("\n\t");
            ticket.append("- %s -> $%.2f".formatted(producto.getNombre(), producto.getPrecio()));
            total += producto.getPrecio();
        }
        ticket.append("\n\t");
        ticket.append("Total --> $").append(total);

        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner sc)
    {
        System.out.print("Nombre del snack: ");
        String nombre = sc.nextLine();
        System.out.print("Precio del snack: ");
        double precio = Double.parseDouble(sc.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Snack agregado correctamente!");
        Snacks.mostrarSnacks();
    }

    public static void main(String[] args)
    {
        maquinaSnacks();
    }
}
