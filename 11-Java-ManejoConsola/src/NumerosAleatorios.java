import java.util.Random;

public class NumerosAleatorios
{
    public static void main(String[] args)
    {
        System.out.println("*** Numeros Aleatorios ***");

        Random random = new Random();

        // Generar un numero aleatorio entre 0 y 9
        int numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio entre 0 y 9 = " + numeroAleatorio);

        // Generar un numero aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio entre 1 y 10 = " + numeroAleatorio);

        // Generar numero flotante entre 0.0 y 1.0
        float flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio entre 0.0 y 1.0= " + flotanteAleatorio);

        // Simular el lanzamiento de un dado (1 y 6)
        int dado = random.nextInt(6) + 1;
        System.out.println("Resultado al lanzar el dado = " + dado);

    }
}
