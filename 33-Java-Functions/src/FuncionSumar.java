public class FuncionSumar
{
    // Definir funcion de suma
    static double sumar(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        double arg1 = 3, arg2 = 8;
        double resultadoFuncion = sumar(arg1, arg2);
        System.out.println("resultadoFuncion = " + resultadoFuncion);

    }
}
