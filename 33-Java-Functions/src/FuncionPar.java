import java.util.Scanner;

public class FuncionPar
{
    // Funcion para saber si un numero es par
    static boolean esPar(double numero)
    {
        // if (numero % 2 == 0)
        //     return true;
        // else
        //     return false;
        return (numero % 2 == 0);
    }

    public static void main(String[] args)
    {
        System.out.print("Proporciona un valor numerico: ");
        double numero = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.printf("Numero par? %b", esPar(numero));
    }
}
