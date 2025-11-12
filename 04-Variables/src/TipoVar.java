public class TipoVar
{
    public static void main(String[] args)
    {
        System.out.println("*** Uso de var en Java ***");
        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);
        // Definir otras variables usando var
        var edad = 30; // Se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // Se infiere el tipo float
        var esCasado = false; // Se infiere el tipo boolean
        esCasado = true;
        // esCasado = "No"; // No podemos asignarle un tipo distinto

        // Se debe definir su valor
        // var precio; // Error: Asignar valor desde el inicio
        // precio = 10;

        // Se debe poder inferir el tipo de dato
        // var apellido = null; // No se puede inferir el tipo de dato
    }
}
