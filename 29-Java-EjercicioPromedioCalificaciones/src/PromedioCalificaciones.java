import java.util.Scanner;

public class PromedioCalificaciones
{
    public static void main(String[] args)
    {
        System.out.println("*** Promedio de Calificaciones ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas Calificaciones deseas agregar?: ");
        int numeroCalificaciones = Integer.parseInt(sc.nextLine());

        // Crear arreglo
        double[] calificaciones = new double[numeroCalificaciones];

        double sumaCalificaciones = 0;
        // Solicitar valores de las calificaciones
        for (int i = 0; i < numeroCalificaciones; i++)
        {
            System.out.printf("Calificacion[%d] = ", i);
            sumaCalificaciones += calificaciones[i] = Double.parseDouble(sc.nextLine());
        }
        System.out.printf("%nPromedio de las Calificaciones: %.2f", sumaCalificaciones / numeroCalificaciones);
    }
}
