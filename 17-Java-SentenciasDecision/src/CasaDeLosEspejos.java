import java.util.Scanner;

public class CasaDeLosEspejos
{
    public static void main(String[] args)
    {
        System.out.println("*** Bienvenidos a la Casa de los Espejos ***");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cual es tu edad? ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.print("Tienes miedo a la oscuridad (true/false)? ");
        boolean miedoOscuro = Boolean.parseBoolean(scanner.nextLine());

        // Verificacion
        if (!miedoOscuro && edad >= 10)
            System.out.println("Puedes entrar a la Casa de los Espejos");
        else
            System.out.println("No puedes entrar a la Casa de los Espejos");
    }
}
