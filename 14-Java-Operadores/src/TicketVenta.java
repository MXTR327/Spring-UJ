import java.util.Scanner;

public class TicketVenta
{
    public static void main(String[] args)
    {
        System.out.println("*** Generacion Ticket de Venta ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Precio leche: ");
        double precioLeche = Double.parseDouble(scanner.nextLine());

        System.out.print("Precio pan: ");
        double precioPan = Double.parseDouble(scanner.nextLine());

        System.out.print("Precio lechuga: ");
        double precioLechuga = Double.parseDouble(scanner.nextLine());

        System.out.print("Precio platanos: ");
        double precioPlatanos = Double.parseDouble(scanner.nextLine());

        System.out.print("Aplicar algun descuento (%)? ");
        int descuentoPorcentaje = Integer.parseInt(scanner.nextLine());

        // Calculo subtotal (sin impuestos)
        double subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        // Aplicar el descuento
        double descuento = subtotal * (descuentoPorcentaje / 100.0);

        // Subtotal con descuento
        double subtotalConDescuento = subtotal - descuento;

        // Calculo con impuestos (16%)
        double impuesto = subtotalConDescuento * 0.16;

        // Calculo total de la compra (con impuestos)
        double totalCompra = subtotalConDescuento + impuesto;

        // Imprimir ticket de venta
        System.out.printf("""
                                  %nTicket de Venta
                                  %n-------------
                                  Subtotal: $%.2f
                                  Descuento: $%.2f (%d%%)
                                  Impuesto (16%%): $%.2f
                                  Costo total compra: $%.2f
                                  """, subtotal, descuento, descuentoPorcentaje, impuesto, totalCompra
                         );
    }
}
