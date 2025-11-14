public class OperadoresAsignacion
{
    public static void main(String[] args)
    {
        System.out.println("*** Operadores de Asignacion ***");
        // Asignacion =
        int myNumber = 10;
        int myNumber2;
        myNumber2 = 15;

        // Asignacion compuesto
        // +=
        myNumber += 5; // myNumber = myNumber + 5;
        System.out.println("myNumber = " + myNumber);
        // -=, *=, /=, %=
        myNumber *= 2; // myNumber = myNumber * 2 -> 30
        System.out.println("myNumber = " + myNumber);
        // Asignacion de variables multiples
        int a = 10, b = 15, c = 20;
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);

    }
}
