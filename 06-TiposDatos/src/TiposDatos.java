public class TiposDatos
{
    public static void main(String[] args)
    {
        // Tipos de datos en java
        // Enteros (su valor por default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32767;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 9223372036854775807L;
        System.out.println("tipoLong = " + tipoLong);

        // Decimales (Su valor por default es de 0.0)
        float tipoFloat = 3.4028235E38F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 1.7976931348623157E308;
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracteres ('\u000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleanos (false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (Referencia)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Max RQ";
        System.out.println("nombre = " + nombre);

    }
}
