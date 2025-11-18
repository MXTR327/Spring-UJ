import java.util.Scanner;

public class RangoVariable
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Proporciona un dato entero: ");
        int dato = Integer.parseInt(scanner.nextLine());

        // Revisamos si esta dentro de rango (1 y 20)
        boolean estaDentroRango = dato >= 1 && dato <=10;
        System.out.println("Variable dentro de rango (1 y 10) ? " + estaDentroRango);

        // Revisar la logica inversa, si el dato esta fuera de rango
        boolean estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("Variable fuera de rango (1 y 10)? " + estaDentroRango);

    }
}
