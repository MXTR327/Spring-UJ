import java.util.Scanner;

public class SistemaAuntenticacion
{
    public static void main(String[] args)
    {
        System.out.println("*** Sistema de Auntenticacion ***");

        final String VALID_USER     = "Maxter327";
        final String VALID_PASSWORD = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese Usuario: ");
        String enteredUser = scanner.nextLine();

        System.out.print("Ingrese Contraseña: ");
        String enteredPassword = scanner.nextLine();

        boolean isAllowed = (enteredUser.equals(VALID_USER)) && (enteredPassword.equals(VALID_PASSWORD));

        System.out.println("Datos son correctos?: " + isAllowed);
    }
}
