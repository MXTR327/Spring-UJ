import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatriz
{
    public static void main(String[] args)
    {
        System.out.println("*** Sumar Matriz Diagonalmente ***");
        Scanner sc = new Scanner(System.in);

        int numeroFilas, numeroColumnas;

        // Definimos matriz
        System.out.print("Proporciona las filas: ");
        numeroFilas = Integer.parseInt(sc.nextLine());
        System.out.print("Proporciona las columnas: ");
        numeroColumnas = Integer.parseInt(sc.nextLine());
        int[][] matriz = new int[numeroFilas][numeroColumnas];

        int[] numerosDiagonal = new int[3];
        // Solicitamos los valores
        for (int row = 0; row < numeroFilas; row++)
        {
            for (int column = 0; column < numeroColumnas; column++)
            {
                System.out.printf("Valor[%d][%d] = ", row, column);
                matriz[row][column] = Integer.parseInt(sc.nextLine());
                if (row == column)
                    numerosDiagonal[row] = matriz[row][column];
            }
            System.out.println();
        }

        System.out.printf("Suma Diagonal = %d + %d + %d = %d", numerosDiagonal[0], numerosDiagonal[1],
                          numerosDiagonal[2], Arrays.stream(numerosDiagonal).sum());
    }
}
