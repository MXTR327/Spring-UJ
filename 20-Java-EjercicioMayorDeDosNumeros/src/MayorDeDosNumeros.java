import java.util.Scanner;

public class MayorDeDosNumeros
{
    public static void main(String[] args)
    {
        System.out.println("*** El mayor de dos numeros ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique primer numero entero: ");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Indique segundo numero entero: ");
        int numero2 = Integer.parseInt(scanner.nextLine());

        String resultado = (numero1 > numero2 ? "El numero mayor es " + numero1
                                              : (numero2 > numero1 ? "El numero mayor es " + numero2
                                                                   : "Ambos numeros son iguales"));
        System.out.println(resultado);
    }
}
