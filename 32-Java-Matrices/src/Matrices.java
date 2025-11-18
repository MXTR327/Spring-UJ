public class Matrices
{
    public static void main(String[] args)
    {
        // Definimos una matriz
        int[][] matriz = new int[2][3];
        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // Accedemos a los valores
        System.out.printf("Valor 1 [0][0] = %d", matriz[0][0]);
        System.out.printf("Valor 5 [1][1] = %d", matriz[1][1]);
        System.out.printf("Valor 6 [1][2] = %d", matriz[1][2]);

    }
}
