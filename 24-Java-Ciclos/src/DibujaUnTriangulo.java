import java.util.Scanner;

public class DibujaUnTriangulo
{
    public static void main(String[] args)
    {
        System.out.println("*** Dibuja un Triangulo ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Proporciona el numero de filas: ");
        int numeroFilas = Integer.parseInt(sc.nextLine());

        // Iteramos sobre cada fila del triangulo
        for (int fila = 1; fila <= numeroFilas; fila++)
        {
            String espacioBlanco = " ".repeat(numeroFilas - fila);
            String asterisco     = "*".repeat(2 * fila - 1);
            System.out.println(espacioBlanco + asterisco);
        }
    }
}
