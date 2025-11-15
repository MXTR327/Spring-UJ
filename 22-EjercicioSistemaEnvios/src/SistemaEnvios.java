import java.util.Locale;
import java.util.Scanner;

public class SistemaEnvios
{
    public static void main(String[] args)
    {
        System.out.println("*** Sistema de Envios ***");
        Scanner scanner = new Scanner(System.in);

        // Definimos tarifas de envio por kg
        final double TARIFA_NACIONAL      = 10;
        final double TARIFA_INTERNACIONAL = 20;

        System.out.print("Ingrese destino del paquete (nacional/internacional): ");
        String destino = scanner.nextLine().strip().toLowerCase();

        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = Double.parseDouble(scanner.nextLine());

        // Calculo del envio del paquete
        // double costoEnvio = (destino.equals("nacional") ? TARIFA_NACIONAL * peso : TARIFA_INTERNACIONAL * peso);
        Double costoEnvio = switch (destino)
        {
            case "nacional" -> TARIFA_NACIONAL * peso;
            case "internacional" -> TARIFA_INTERNACIONAL * peso;
            default ->
            {
                System.out.println("Destino invalido. Ingresa nacional/internacional");
                yield null;
            }
        };
        // Mostramos costo de envio
        if (costoEnvio != null)
            System.out.printf("El costo del envio del paquete es: $%.2f", costoEnvio);
    }
}
