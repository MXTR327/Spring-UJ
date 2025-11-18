import java.util.Scanner;

public class Arreglos
{
    public static void main(String[] args)
    {
        // Introducir valores a un arreglo
        Scanner sc = new Scanner(System.in);
        // Declarar el arreglo
        System.out.printf("Proporciona el largo del arreglo: ");
        int largoArreglo = Integer.parseInt(sc.nextLine());
        // Creamos de manera dinamica el arreglo
        int[] enteros = new int[largoArreglo];
        // Solicitar los valores del arreglo
        for (int i = 0; i < largoArreglo; i++)
        {
            System.out.printf("Proporciona enteros[%d]: ", i);
            enteros[i] = Integer.parseInt(sc.nextLine());
        }
        // Imprimir los valores del arreglo
        System.out.println("\nImpresion del Arreglo: ");
        for (int i = 0; i < largoArreglo; i++)
        {
            System.out.printf("enteros[%d] = %d%n", i, enteros[i]);
        }

        // Arreglos
        // int[] enteros = {100, 200, 300, 400, 500};
        // int[] enteros = new int[]{100, 200, 300, 400, 500};
        // Iterar sobre los elementos del arreglo
        // for (int i = 0; i < enteros.length; i++)
        //     System.out.printf("Valor del indice: %d, valor: %d%n", i, enteros[i]);

        // Acceder a los elementos del arreglo
        // System.out.println("Valor 1: " + enteros[0]);
        // System.out.println("Valor 2: " + enteros[1]);
        // System.out.println("Valor 3: " + enteros[2]);
        // System.out.println("Valor 4: " + enteros[3]);
        // System.out.println("Valor 5: " + enteros[4]);

        // Imprimir el arreglo
        // System.out.println("Imprimir el arreglo: " + enteros);

        // int[] enteros = new int[5];
        // Modificar elementos
        // enteros[0] = 13;
        // enteros[1] = 21;
        // enteros[4] = 62;
        //
        // Leer los elementos del arreglo
        // System.out.println("Valor 1 = " + enteros[0]);
        // System.out.println("Valor 2 = " + enteros[1]);
        // System.out.println("Valor 5 = " + enteros[4]);


        // 1. Declaramos un arreglo
        // int[] enteros;

        // 2. Inicializar el arreglo
        // enteros = new int[3];

        // Declarar e inicializar un arreglo
        // int[] numeros = new int[2];
    }
}
