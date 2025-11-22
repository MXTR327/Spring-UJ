package ventas;

public class Orden
{
    private final        int        idOrden;
    private              Producto[] productos;
    private              int        contadorProductos;
    private static final int        MAX_PRODUCTOS = 10;
    private static       int        contadorOrdenes;

    public Orden()
    {
        idOrden   = ++Orden.contadorOrdenes;
        productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    @Override
    public String toString()
    {
        StringBuilder resultado = new StringBuilder();
        resultado.append("""
                           Id Orden: %d
                               Total de la Orden: $%.2f
                               Productos de la Orden:
                           """.formatted(idOrden, calcularTotal()));
        for (int i = 0; i < contadorProductos; i++)
             resultado.append("\t\t").append(productos[i]);

        return resultado.toString();
    }

    public void agregarProducto(Producto producto)
    {
        if (contadorProductos < Orden.MAX_PRODUCTOS)
            productos[contadorProductos++] = producto;
        else
            System.out.printf("Se ha superado el maximo de productos: %d%n", Orden.MAX_PRODUCTOS);
    }

    public double calcularTotal()
    {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++)
        {
            Producto producto = productos[i];
            total += producto.getPrecio();
        }
        return total;
    }
}
