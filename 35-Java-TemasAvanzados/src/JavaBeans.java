import java.io.Serializable;

public class JavaBeans
{
    public static void main(String[] args)
    {
        Persona persona = new Persona();
        persona.setNombre("Karla");
        persona.setApellido("Lara");
        System.out.println("persona = " + persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
    }
}

class Persona implements Serializable
{
    private String nombre;
    private String apellido;

    public Persona()
    {
    }

    @Override
    public String toString()
    {
        return "Persona{nombre='%s', apellido='%s'}".formatted(nombre, apellido);
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
