import java.util.Scanner;

public class SistemaBancario
{
    public static void main(String[] args)
    {
        System.out.println("*** Bienvenidos al Sistema Bancario ***");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseas salir del sistema (true/false)? ");
        boolean salirSistema = Boolean.parseBoolean(scanner.nextLine());

        // Verificamos (aplicando una logica inversa)
        if (!salirSistema)
            System.out.println("Continuamos dentro del sistema...");
        else
            System.out.println("Saliendo del sistema...");

    }
}
