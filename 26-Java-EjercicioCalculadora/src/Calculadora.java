import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args)
    {
        double  num1, num2;
        boolean isClose = false;
        Scanner scanner = new Scanner(System.in);
        while (!isClose)
        {
            System.out.print("""
                                     *** Calculadora en Java ***
                                     Operaciones que puedes realizar:
                                     1. Suma
                                     2. Resta
                                     3. Multiplicacion
                                     4. Division
                                     5. Salir
                                     Escoje una opcion:\s""");
            int option = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el primer valor: ");
            num1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese el segundo valor: ");
            num2 = Double.parseDouble(scanner.nextLine());

            switch (option)
            {
                case 1 -> System.out.printf("El resultado de la suma es: %.2f", num1 + num2);
                case 2 -> System.out.printf("El resultado de la resta es: %.2f", num1 - num2);
                case 3 -> System.out.printf("El resultado de la multiplicacion es: %.2f", num1 * num2);
                case 4 -> System.out.println(num2 != 0 ? "El resultado de la division es: " + (num1 / num2)
                                                       : "No se puede dividir entre 0");
                case 5 ->
                {
                    isClose = true;
                    System.out.println("Saliendo de la calculadora... Gracias vuelva pronto.");
                }
                default -> System.out.println("Opcion invalida elija una opcion del 1 al 5");
            }
            System.out.println();
        }
    }
}
