public class Funciones
{
    static void saludarDesdeJava(String mensaje)
    {
        System.out.printf("Mensaje: %s", mensaje);
    }

    public static void main(String[] args)
    {
        saludarDesdeJava("Hola desde funcion Java");
        saludarDesdeJava("Adios");
    }
}
