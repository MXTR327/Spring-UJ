import java.util.Scanner;

public class EstacionAnio
{
    public static void main(String[] args)
    {
        System.out.println("*** Estacion del año ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Proporciona el valor del mes (1-12): ");
        int mes = Integer.parseInt(scanner.nextLine());

        // Revision del mes usando la sintaxis switch mejorada
        String estacion = switch (mes)
        {
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Estacion desconocida: " + mes;
        };

        // Mostrar resultado
        System.out.printf("La estacion para el mes %d es %s", mes, estacion);

        // if (mes == 1 || mes == 2 || mes == 12)
        //     estacion = "Invierno";
        // else if (mes == 3 || mes == 4 || mes == 5)
        //     estacion = "Primavera";
        // else if (mes == 6 || mes == 7 || mes == 8)
        //     estacion = "Verano";
        // else if (mes == 9 || mes == 10 || mes == 11)
        //     estacion = "Otoño";
        // else
        //     estacion = "Estacion desconocida: " + mes;
    }
}
