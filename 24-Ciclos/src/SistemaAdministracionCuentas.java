import java.util.Scanner;

public class SistemaAdministracionCuentas
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean salir   = false;
        // Comenzar con la iteracion del menu
        while (!salir)
        {
            System.out.print("""
                                     *** Sistema de Administracion de Cuentas ***
                                     Menu:
                                     1. Crear Cuenta
                                     2. Eliminar Cuenta
                                     3. Salir
                                     Escoje una opcion:\s""");
            int opcion = scanner.nextInt();
            // Evaluar cada opcion
            switch (opcion)
            {
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 ->
                {
                    System.out.println("Saliendo del sistema hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opcion Invalida...\n");
            }
        }
        System.out.println("Fin del Sistema de Administracion de Cuentas");
    }
}
