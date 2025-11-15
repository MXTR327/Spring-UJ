import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico
{
    public static void main(String[] args)
    {
        System.out.println("*** Sistema Generador de ID Unico ***");
        Scanner scanner = new Scanner(System.in);
        Random  random  = new Random();

        String name;
        String lastName;
        String birthDate;

        // Solicitar nombre
        System.out.print("Ingrese su nombre: ");
        name = scanner.nextLine();
        // Solicitar apellido
        System.out.print("Ingrese su apellido: ");
        lastName = scanner.nextLine();
        // Solicitar año nacimiento
        System.out.print("Ingrese su año de nacimiento (YYYY): ");
        birthDate = scanner.nextLine();

        // Normalizar valores
        String normalizedName      = name.trim().toUpperCase().substring(0, 2);
        String normalizedLastName  = lastName.trim().toUpperCase().substring(0, 2);
        String normalizedBirthDate = birthDate.trim().substring(2);

        // Generar aleatorio entre 1 y 9999
        int randomFourDigitsNumber = random.nextInt(9999) + 1;

        // Formato 4 digitos
        String formattedRandomNumber = String.format("%04d", randomFourDigitsNumber);

        // Generar ID unico
        String id = normalizedName + normalizedLastName + normalizedBirthDate + formattedRandomNumber;

        System.out.printf("""
                                  %nHola %s
                                  \tTu nuevo numero de identificacion (ID) generado por el sistema es:
                                  \t%s
                                  ¡Felicidades!
                                  """,
                          name, id
                         );
    }
}
