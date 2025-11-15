import java.util.Scanner;

public class SistemaAutenticacion
{
    public static void main(String[] args)
    {
        System.out.println("*** Sistema de Autenticacion ***");
        Scanner scanner = new Scanner(System.in);

        final String USUARIO_VALIDO  = "Maxter327";
        final String PASSWORD_VALIDO = "1234";

        System.out.print("Ingresa tu usuario: ");
        String usuarioIngresado = scanner.nextLine().strip();

        System.out.print("Ingresa tu password: ");
        String passwordIngresado = scanner.nextLine().strip();

        // Validar casos usuario y password
        String mensajeAutenticacion = switch (usuarioIngresado)
        {
            case USUARIO_VALIDO ->
                    PASSWORD_VALIDO.equals(passwordIngresado) ? "Bienvenido al Sistema" : "Password Invalido";
            default -> PASSWORD_VALIDO.equals(passwordIngresado) ? "Usuario Incorrecto, favor de corregirlo!!"
                                                                 : "Usuario y Password Incorrectos, favor de corregirlos!!";
        };
        System.out.println(mensajeAutenticacion);

        // if (usuarioIngresado.equals(USUARIO_VALIDO) && passwordIngresado.equals(PASSWORD_VALIDO))
        //     System.out.println("Bienvenido al Sistema");
        // else if (!usuarioIngresado.equals(USUARIO_VALIDO) && !passwordIngresado.equals(PASSWORD_VALIDO))
        //     System.out.println("Usuario y Password Invalido");
        // else if (!usuarioIngresado.equals(USUARIO_VALIDO))
        //     System.out.println("Usuario Invalido");
        // else
        //     System.out.println("Password Invalido");
    }
}
