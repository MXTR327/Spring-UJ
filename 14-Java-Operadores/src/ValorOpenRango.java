import java.util.Scanner;

public class ValorOpenRango
{
    public static void main(String[] args)
    {
        System.out.println("*** Valor Dentro Rango ***");

        // Definimos los limites
        final int MINIMO = 0;
        final int MAXIMO = 5;

        // Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un dato entre 0 y 5: ");
        int dato = Integer.parseInt(new Scanner(System.in).nextLine());

        // Verificar si el dato esta dentro de rango
        boolean estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("estaDentroRango? " + estaDentroRango);

    }
}
