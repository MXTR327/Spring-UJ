public class NumerosInversos
{
    public static void main(String[] args)
    {
        System.out.println("*** Numeros Inversos ***");
        int contador = 10;
        do
        {
            System.out.print(contador-- + " ");
        }
        while (contador > 0);
    }
}
