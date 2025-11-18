import java.util.Scanner;

public class LeerTiposDeDato
{
    public static void main(String[] args)
    {
        // Leer distintos tipos de datos
        // Leer tipo int
        Scanner console = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = console.nextInt();
        System.out.println("edad = " + edad);

        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        double altura = console.nextDouble();
        System.out.println("altura = " + altura);

        // Consumimos el caracter de salto de linea
        console.nextLine();
        // Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        String nombre = console.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversion de datos
        System.out.print("Proporciona un valor entero: ");
        // String enteroString = console.nextLine();
        // int entero = Integer.parseInt(enteroString);
        int entero = Integer.parseInt(console.nextLine());
        System.out.println("entero = " + entero);

        // Tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        float flotante = Float.parseFloat(console.nextLine());

        // Tipo Double
        System.out.print("Proporciona un valor double: ");
        double doble = Double.parseDouble(console.nextLine());
        System.out.println("doble = " + doble);

        // Tipo boolean
        System.out.print("Proporciona un valor boolean: ");
        boolean booleano = Boolean.parseBoolean(console.nextLine());
        System.out.println("booleano = " + booleano);



    }
}
