import java.util.Scanner;

public class SaludYFitness
{
    public static void main(String[] args)
    {
        System.out.println("*** Salud y Fitness ***");

        // Constantes
        final int    META_PASOS_DIARIO = 10000;
        final double CALORIAS_POR_PASO = 0.04; // Valor aproximado, son kilocalorias

        // Pedimos los valores al usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cual es tu nombre? ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Cuantos pasos has caminado hoy? ");
        int pasosDiarios = Integer.parseInt(scanner.nextLine());

        // Verificar si el usuario alcanzo la meta de pasos diarios
        String metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIO) ? "Si :)" : "No :(";

        // Calculamos las calorias quemadas
        double caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        // Mostramos la informacion
        System.out.printf("""
                                  %nUsuario: %s
                                  Pasos dados hoy: %d
                                  Calorias quemadas: %.2f kcal
                                  Meta de pasos diarios alcanzada: %s
                                  -----------------------------------
                                  La meta de pasos diarios es de: %d pasos
                                  """, nombreUsuario, pasosDiarios, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIO
        );
    }
}
