import java.util.Scanner;

public class IntroducirValoresMatriz
{
    public static void main(String[] args)
    {
        // Introducir valores a una matriz
        int     numeroFilas, numeroColumnas;
        Scanner sc = new Scanner(System.in);
        // Pedir número de numeroFilas
        System.out.print("Proporciona los renglones: ");
        numeroFilas = Integer.parseInt(sc.nextLine());
        System.out.print("Proporciona las numeroColumnas: ");
        numeroColumnas = Integer.parseInt(sc.nextLine());
        int[][] matriz = new int[numeroFilas][numeroColumnas];
        // Solicitar los valores
        for (int fila = 0; fila < numeroFilas; fila++)
        {
            for (int columna = 0; columna < numeroColumnas; columna++)
            {
                System.out.printf("Valor [%d][%d] = ", fila, columna);
                matriz[fila][columna] = Integer.parseInt(sc.nextLine());
            }
        }

        // Iterar los valores de la matriz
        for (int fila = 0; fila < numeroFilas; fila++)
        {
            for (int columna = 0; columna < numeroColumnas; columna++)
                System.out.printf("Matriz[%d][%d] = %d      ", fila, columna, matriz[fila][columna]);

            System.out.println("\n");
        }

        System.out.println(numeroFilas);
    }
}
