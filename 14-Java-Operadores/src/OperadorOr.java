public class OperadorOr
{
    public static void main(String[] args)
    {
        System.out.println("*** Operador OR ***");
        boolean a = true, b = false;
        // or (regresa true si al menos uno de los valores es true)
        boolean resultado = a || b;
        System.out.println("resultado = " + resultado);
    }
}
