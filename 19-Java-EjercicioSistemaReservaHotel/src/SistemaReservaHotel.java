import java.util.Scanner;

public class SistemaReservaHotel
{
    public static void main(String[] args)
    {
        System.out.println("*** Sistema de Reserva de Hotel ***");
        Scanner scanner = new Scanner(System.in);

        // Variables del hotel
        final double TARIFA_DIA_SIN_VISTA_AL_MAR = 150.50;
        final double TARIFA_DIA_CON_VISTA_AL_MAR = 190.50;

        // Pedir informacion al cliente
        System.out.print("Nombre del Cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Dias de estadia: ");
        int diasEstadia = Integer.parseInt(scanner.nextLine());

        System.out.print("Con vista al mar (true/false)? ");
        boolean conVistaMar = Boolean.parseBoolean(scanner.nextLine());

        // Calculo del costo total de la estadia
        double costoTotal = conVistaMar ? TARIFA_DIA_CON_VISTA_AL_MAR * diasEstadia
                                        : TARIFA_DIA_SIN_VISTA_AL_MAR * diasEstadia;

        // Mostramos los detalles de la reserva
        System.out.printf("""
                                  %n------------- Detalles de la Reservacion -------------
                                  Cliente: %s
                                  Dias de estadia: %d
                                  Costo total: $%.2f
                                  Habitacion con vista al mar: %s
                                  """, nombreCliente, diasEstadia, costoTotal, conVistaMar ? "Si :)" : "No :("
        );
    }
}
