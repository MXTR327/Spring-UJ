public class DetalleLibro
{
    public static void main(String[] args)
    {
        // Detalle de un libro
        String  tituloLibro     = "El señor de los anillos";
        int     anioPublicacion = 1954;
        boolean libroDisponible = true;
        double  precio          = 500.50;

        System.out.println("Detalles del Libro:");
        System.out.println("Título: " + tituloLibro);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Disponible: " + libroDisponible);
        System.out.println("Precio: $" + precio);
        // Modificar el titulo del libro
        tituloLibro = "El Señor de los anillos";
        System.out.println(tituloLibro);

    }
}
