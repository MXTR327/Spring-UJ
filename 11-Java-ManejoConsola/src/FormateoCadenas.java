public class FormateoCadenas
{
    public static void main(String[] args)
    {
        System.out.println("*** Formateo de Cadenas ***");

        String name   = "Max";
        int    age    = 35;
        double salary = 21000.50;

        // String.format
        String message = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", name, age, salary);
        System.out.println("message = " + message);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", name, age, salary);

        int employeeNumber = 12;
        // Formateo con text block
        message = """
                %nDetalle Persona:\s
                ----------------
                \tNombre: %s
                \tNo. Empleado: %d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(name, employeeNumber, age, salary);
        System.out.println(message);

        // Formateo con text block y printf directamente
        System.out.printf("""
                                  %nDetalle Persona:\s
                                  ----------------
                                  \tNombre: %s
                                  \tNo. Empleado: %d
                                  \tEdad: %d años
                                  \tSalario: $%.2f
                                  """, name, employeeNumber, age, salary
                         );

    }
}
