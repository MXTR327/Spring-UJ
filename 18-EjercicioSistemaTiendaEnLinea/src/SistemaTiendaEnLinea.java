import java.util.Scanner;

public class SistemaTiendaEnLinea
{
    public static void main(String[] args)
    {
        System.out.println("*** Tienda en Linea con Descuentos ***");

        final var MONTO_COMPRA_DESC = 1000.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cual fue el monto de tu compra?: ");
        double montoCompra = Double.parseDouble(scanner.nextLine());

        System.out.print("Eres miembro de la tienda (true/false): ");
        boolean esMiembro = Boolean.parseBoolean(scanner.nextLine());

        // Calcularmos descuento
        double descuento = 0.0;

        // Verificar cada caso con datos proporcionados
        if (montoCompra >= MONTO_COMPRA_DESC && esMiembro)
            descuento = 0.1; // Descuento del 10%
        else if (esMiembro)
            descuento = 0.05; // Descuento del 5%

        // Hacemos los calculos
        if (descuento != 0)
        {
            double montoDescuento = montoCompra * descuento;
            double montoFinal     = montoCompra - montoDescuento;

            System.out.printf("""
                                      %nFelicidades!, has obtenido un descuento del %.0f%%
                                      Monto de la compra: $%.2f
                                      Monto del descuento: $%.2f
                                      Monto final del la compra con descuento: $%.2f%n
                                      """, descuento * 100, montoCompra, montoDescuento, montoFinal
            );
        }
        else
        {
            System.out.printf("""
                                      %nNo ibtuviste ningun tipo de descuento
                                      Te invitamos a hacerte miembro de la tienda
                                      Monto final del la compra: $%.2f%n
                                      """, montoCompra
            );
        }
    }
}
