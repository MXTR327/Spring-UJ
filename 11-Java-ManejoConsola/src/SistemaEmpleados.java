import java.util.Scanner;

public class SistemaEmpleados
{
    public static void main(String[] args)
    {
        System.out.println("*** Sistema de Empleados ***");

        Scanner console = new Scanner(System.in);

        // Nombre del empleado
        System.out.print("Nombre del empleado: ");
        String employeeName = console.nextLine();

        // Edad del empleado
        System.out.print("Edad del empleado: ");
        int employeeAge = Integer.parseInt(console.nextLine());

        // Salario del empleado
        System.out.print("Salario del empleado: ");
        var employeeSalary = Double.parseDouble(console.nextLine());

        // Es jefe de departamento
        System.out.print("Es jefe de departamento (true/false)?: ");
        boolean isManager = Boolean.parseBoolean(console.nextLine());

        // Imprimir valores proporcionados del Empleado
        System.out.println();
        System.out.println("Datos del Empleado: ");
        System.out.println("\tNombre: " + employeeName);
        System.out.println("\tEdad: " + employeeAge);
        // System.out.println("\tSalario: " + employeeSalary);
        System.out.printf("\tSalario: $%.2f" +
                                  "", employeeSalary);
        System.out.println("\tEs jefe de departamento: " + isManager);


    }
}
