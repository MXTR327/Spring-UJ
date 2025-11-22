package excepciones;

public class PruebaAritmetica
{
    public static void main(String[] args)
    {
        try
        {

            int resultado = Aritmetica.division(10, 5);
            System.out.println("resultado = " + resultado);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
        finally
        {
            System.out.println("Se reviso la division entre cero");
        }
    }
}
