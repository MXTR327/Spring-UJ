public class RecorrerMatrizSimplificado
{
    public static void main(String[] args)
    {
        // Definimos una matriz
        int[][] matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        // Recorrer una matriz
        // 1. Ciclo mas externo. Recorrer los renglones
        for (var fila = 0; fila < matriz.length; fila++)
        {
            // 2. Ciclo interno. Recorrer las columnas
            for (var columns = 0; columns < matriz[fila].length; columns++)
                System.out.printf("Valor en [%d][%d] = %d       ", fila, columns, matriz[fila][columns]);
            System.out.println("\n");
        }
    }
}
