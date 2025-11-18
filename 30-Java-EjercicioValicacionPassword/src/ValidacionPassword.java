import java.util.Scanner;

public class ValidacionPassword
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                                 *** Programa Validador de Contraseña ***
                                 Ingrese una contraseña (minimo 6 caracteres):\s""");

        String password = scanner.nextLine();

        while (password.length() < 6)
        {
            System.out.println("\nContraseña invalida no cumple con los requisitos");
            System.out.print("Ingrese nuevo valor de password: ");
            password = scanner.nextLine();
        }

        System.out.printf("El valor de password es valido... Se establecio: %s", password);
    }
}
