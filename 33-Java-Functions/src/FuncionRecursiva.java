public class FuncionRecursiva
{
    // Imprimir valores del 1 a 5 usando una funcion recursiva
    // Funcion recursiva
    static void funcionRecursiva(int numero)
    {
        // Caso base
        if (numero == 1)
        {
            System.out.printf("%d ", numero);
            return;
        }

        // Caso recursivo
        funcionRecursiva(numero - 1);
        System.out.printf("%d ", numero);
    }

    public static void main(String[] args)
    {
        funcionRecursiva(5);
    }
}
