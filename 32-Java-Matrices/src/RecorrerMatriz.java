public class RecorrerMatriz
{
    public static void main(String[] args)
    {
        // Definimos una matriz
        final var FILAS    = 2;
        final var COLUMNAS = 3;
        int[][]   matriz   = new int[FILAS][COLUMNAS];
        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // Recorrer una matriz
        // 1. Ciclo mas externo. Recorrer los renglones
        for (var fila = 0; fila < FILAS; fila++)
        {
            // 2. Ciclo interno. Recorrer las columnas
            for (var columns = 0; columns < COLUMNAS; columns++)
                System.out.printf("Valor en [%d][%d] = %d       ", fila, columns, matriz[fila][columns]);
            System.out.println("\n");
        }
    }
}
