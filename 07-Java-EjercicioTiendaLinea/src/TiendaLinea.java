public class TiendaLinea
{
    public static void main(String[] args)
    {
        String  productName;
        double  price;
        int     stock;
        boolean isAvailable;

        productName = "Camiseta";
        price = 25.99;
        stock = 100;
        isAvailable = true;

        System.out.println("*** Detalles del Producto ***");
        System.out.println("Nombre: " + productName);
        System.out.println("Precio: $" + price);
        System.out.println("Stock: " + stock + " unidades");
        System.out.println("Disponible: " + (isAvailable ? "Sí" : "No"));

        System.out.println("\n");

        productName = "Pantalón";
        price = 45.50;
        stock = 50;
        isAvailable = false;

        System.out.println("*** Detalles del Producto Actualizados ***");
        System.out.println("Nombre: " + productName);
        System.out.println("Precio: $" + price);
        System.out.println("Stock: " + stock + " unidades");
        System.out.println("Disponible: " + (isAvailable ? "Sí" : "No"));
    }
}
