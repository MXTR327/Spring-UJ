public class NumerosParesFor
{
    public static void main(String[] args)
    {
        System.out.println("*** Numeros Pares usando el ciclo For ***");
        for (int i = 1; i <= 20; i++)
        {
            if (i % 2 == 0)
                System.out.println(i + " ");
        }
    }
}
