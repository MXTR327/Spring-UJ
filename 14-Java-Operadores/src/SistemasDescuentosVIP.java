import java.util.Scanner;

public class SistemasDescuentosVIP
{
    public static void main(String[] args)
    {
        System.out.println("*** Sistemas de Descuentos VIP ***");
        final int NO_PRODUCTOS_DESCUENTO = 10;
        Scanner   scanner                = new Scanner(System.in);

        System.out.print("Cuantos productos compraste hoy?: ");
        int cantidadProductos = Integer.parseInt(scanner.nextLine());

        System.out.print("Tienes la membresia de la tienda (true/false)?: ");
        boolean tienesMembresia = Boolean.parseBoolean(scanner.nextLine());

        boolean esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia;
        System.out.println("Tienes acceso al descuento VIP?: " + esElegibleDescuento);

    }
}
