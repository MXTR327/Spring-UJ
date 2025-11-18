public class PalabraBreak
{
    public static void main(String[] args)
    {
        System.out.println("*** Break y Continue ***");

        // Ejemplo break, imprimir solo pares
        System.out.println("\nPalabra Break: ");
        for (int i = 1; i < 10; i++)
        {
            if (i % 2 == 0)
            {
                System.out.printf("%d ", i);
                break;
            }
        }

        // Ejemplo continue, imprimir pares e ingorar impares
        System.out.println("\nPalabra continue: ");
        for (int i = 1; i < 10; i++)
        {
            if (i % 2 == 1)
                continue; // Salta a la siguiente iteracion

            System.out.printf("%d ", i); // Numeros pares
        }
    }
}
