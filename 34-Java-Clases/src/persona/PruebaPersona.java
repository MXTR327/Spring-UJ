package persona;

public class PruebaPersona
{
    public static void main(String[] args)
    {
        System.out.println("*** Creacion de Clase y Objetos de tipo persona.Persona ***");
        System.out.printf("Variable estatica: %d%n", Persona.getContadorPersonas());
        // Primer Objeto
        Persona persona1 = new Persona("Juan", "Perez");
        System.out.println(persona1); // Automaticamente se llama toString
        System.out.printf("Variable estatica: %d%n", Persona.getContadorPersonas());
        // Segundo Objeto
        Persona persona2 = new Persona("Karla", "Lara");
        System.out.println(persona2);
        System.out.printf("Variable estatica: %d%n", Persona.getContadorPersonas());

        // // Segundo Objeto
        // Persona persona2 = new Persona();
        // persona2.setNombre("Karla");
        // persona2.setApellido("Lara");
        // persona2.mostrarPersona();
    }
}
