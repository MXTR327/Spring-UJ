package ventas;

public class Producto
{
    private final  int    idProducto;
    private        String nombre;
    private        double precio;
    private static int    contadorProductos;

    public Producto(String nombre, double precio)
    {
        this.idProducto = ++Producto.contadorProductos;
        this.nombre     = nombre;
        this.precio     = precio;
    }

    @Override
    public String toString()
    {
        return """
            Producto {
                \t\tidProducto=%d,
                \t\tnombre='%s',
                \t\tprecio=%.2f
            \t\t}
            """.formatted(idProducto, nombre, precio);
    }


    public int getIdProducto()
    {
        return idProducto;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
}
