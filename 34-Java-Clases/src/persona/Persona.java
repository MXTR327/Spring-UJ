package persona;

public class Persona
{
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    public Persona()
    {
    }

    public Persona(String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        // Asignamos id unico con ayuda de variable estatica
        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString()
    {
        return "Id: " + this.idPersona + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Dir. Mem.: " + super.toString();
    }

    public int getIdPersona()
    {
        return idPersona;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public static int getContadorPersonas()
    {
        return Persona.contadorPersonas;
    }
}
