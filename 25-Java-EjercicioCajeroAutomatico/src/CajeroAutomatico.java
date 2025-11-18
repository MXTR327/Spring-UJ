import java.util.Scanner;

public class CajeroAutomatico
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double  saldoInicial = 1000;
        boolean salir        = false;

        // Menu Aplicacion
        while (!salir)
        {
            System.out.print("""
                                     *** Aplicacion de Cajero Automatico ***
                                     Operaciones que puedes realizar:
                                     1. Consultar Saldo
                                     2. Retirar Dinero
                                     3. Depositar Dinero
                                     4. Salir
                                     Escoje una opcion:\s""");
            int opcion = scanner.nextInt();

            switch (opcion)
            {
                case 1 -> System.out.println("Tu saldo actual es: $" + saldoInicial);
                case 2 ->
                {

                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = scanner.nextDouble();
                    if (!(cantidadRetirar > saldoInicial))
                    {
                        saldoInicial -= cantidadRetirar;
                        System.out.println("Retiro exitoso. Tu nuevo saldo es: $" + saldoInicial);
                    }
                    else
                    {
                        System.out.printf("No cuentas con el saldo suficiente. ");
                        System.out.println("Saldo insuficiente.");
                    }
                }
                case 3 ->
                {
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDepositar = scanner.nextDouble();
                    saldoInicial += cantidadDepositar;
                    System.out.printf("Tu nuevo saldo es : $%.2f%n%n", saldoInicial);
                }
                case 4 ->
                {
                    salir = true;
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                }
                default -> System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.\n");
            }
            System.out.println();
        }
    }
}
