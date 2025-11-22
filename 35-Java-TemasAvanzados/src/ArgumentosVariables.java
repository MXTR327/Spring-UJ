public class ArgumentosVariables
{
    static void imprimirNumeros(int... numeros)
    {
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros[i] + " ");
        }
    }

    static void variosParametros(String nombre, int... numeros)
    {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    public static void main(String[] args)
    {
        System.out.println("*** Argumentos variables ***");
        imprimirNumeros(1, 2, 3, 4, 5); // var args

        System.out.println();

        System.out.println("*** Varios parametros ***");
        variosParametros("Karla", 10, 20, 30);

    }


}
