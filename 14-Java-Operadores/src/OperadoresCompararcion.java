public class OperadoresCompararcion
{
    public static void main(String[] args)
    {
        System.out.println("*** Operadores de Comparacion ***");
        int a = 3, b = 2;

        // Igualdad ==
        boolean result = a == b;
        System.out.println("result a == b : " + result);

        // Distinto !=
        result = a != b;
        System.out.println("result a != b : " + result);

        // Mayor que
        result = a > b;
        System.out.println("result a > b : " + result);

        // Mayor o igual que
        result = a >= b;
        System.out.println("result a >= b : " + result);

        // Menor que
        result = a < b;
        System.out.println("result a < b : " + result);

        // Menor o igual que
        result = a <= b;
        System.out.println("result a <= b : " + result);
    }
}
