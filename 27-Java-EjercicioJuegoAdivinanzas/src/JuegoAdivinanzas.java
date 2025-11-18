import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas
{
    public static void main(String[] args)
    {
        System.out.println("*** Juego de Adivina el Numero ***");
        Scanner sc = new Scanner(System.in);

        final int SECRET_NUMBER = new Random().nextInt(50) + 1;

        final int MAX_ATTEMPS = 15;
        int       attempts    = 0, guess = 0;

        while (guess != SECRET_NUMBER && attempts != MAX_ATTEMPS)
        {
            System.out.printf("""
                                      Te quedan %s intentos...
                                      Ingrese un numero (1-50):\s""", MAX_ATTEMPS - attempts
            );
            guess = Integer.parseInt(sc.nextLine());

            System.out.println("El numero secreto es " + (guess < SECRET_NUMBER ? "mayor" : "menor"));

            attempts++;
            System.out.println();
        }

        if (SECRET_NUMBER == guess)
            System.out.printf("Felicidades, adivinaste el numero secreto en %d intentos%n", attempts);
        else
            System.out.println("Lo siento has agotado tus intentos maximos");

        System.out.println("El numero secreto era: " + SECRET_NUMBER);
    }
}
