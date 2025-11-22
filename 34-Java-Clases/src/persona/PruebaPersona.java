package prueba_persona;

import persona.Persona;

public class PruebaPersona
{
    public static void main(String[] args)
    {
        System.out.println("*** Creacion de Clase y Objetos de tipo persona.Persona ***");
        // Primer Objeto
        Persona persona1 = new Persona("Juan", "Perez");
        persona1.mostrarPersona();

        System.out.println();

        // Segundo Objeto
        Persona persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Lara");
        persona2.mostrarPersona();
    }
}
