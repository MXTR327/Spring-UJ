package Persona;

public class Persona
{
    String nombre;
    String apellido;

    void mostrarPersona()
    {
        // String variableLocal = "Valor1";
        // System.out.println("variableLocal = " + variableLocal);
        System.out.printf("Nombre: %s ", nombre);
        System.out.printf("Apellido: %s ", apellido);
    }

    public static void main(String[] args)
    {
        System.out.println("*** Creacion de Clase y Objetos de tipo Persona.Persona ***");
        // Primer Objeto
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.mostrarPersona();

        // Segundo Objeto
        Persona persona2 = new Persona();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.mostrarPersona();
    }
}
