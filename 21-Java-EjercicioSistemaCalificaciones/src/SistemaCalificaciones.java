import java.util.Scanner;

public class SistemaCalificaciones
{
    public static void main(String[] args)
    {
        System.out.println("*** Sistema de Calificaciones ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese Calificacion (1-10): ");
        double calificacion = Double.parseDouble(scanner.nextLine());

        String resultado = "";

        if (calificacion >= 9 && calificacion <= 10)
            resultado = "A";
        else if (calificacion == 8)
            resultado = "B";
        else if (calificacion == 7)
            resultado = "C";
        else if (calificacion == 6)
            resultado = "D";
        else if (calificacion >= 0 && calificacion < 6)
            resultado = "F";
        else
            resultado = "Valor desconocido";

        System.out.printf("Calificacion %.1f es equivalente a %s", calificacion, resultado);
    }
}
