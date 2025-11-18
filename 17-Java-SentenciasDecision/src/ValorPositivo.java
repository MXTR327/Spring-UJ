import java.util.Scanner;

public class ValorPositivo
{
    public static void main(String[] args)
    {
        System.out.println("*** Valor Positivo ***");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Proporciona un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero > 0)
            System.out.println("El numero " + numero + " es positivo");
        else if (numero == 0)
            System.out.println("El numero " + numero + " es cero");
        else
            System.out.println("El numero " + numero + " es negativo");

    }
}
