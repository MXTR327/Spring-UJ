import java.util.Scanner;

public class ManejoConsola
{
    public static void main(String[] args)
    {
        // Introducir valores por consola
        Scanner console = new Scanner(System.in); // in - input - entrada de datos
        System.out.println("Escribe tu nombre: ");
        String nombre = console.nextLine();
        System.out.println("nombre = " + nombre);

    }
}
