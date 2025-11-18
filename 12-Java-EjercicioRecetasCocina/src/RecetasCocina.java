import java.util.Scanner;

public class RecetasCocina
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String recipeName;
        String recipeIngredients;
        int    recipeTimePreparation;
        String recipeDifficulty;

        System.out.println("*** Recetas Cocina ***");

        // Nombre
        System.out.print("Introduce el nombre: ");
        recipeName = scanner.nextLine();

        // Ingredientes
        System.out.print("Introduce los ingredientes: ");
        recipeIngredients = scanner.nextLine();

        // Tiempo de preparacion
        System.out.print("Introduce el tiempo de preparación (min): ");
        recipeTimePreparation = Integer.parseInt(scanner.nextLine());

        // Deficultad de la preparacion
        System.out.print("Introduce la dificultad (Facil/Medio/Dificil): ");
        recipeDifficulty = scanner.nextLine();

        // Imprimir los valores de la receta
        System.out.println();
        System.out.println("--- Receta de Cocina ---");
        System.out.println("\tNombre receta: " + recipeName);
        System.out.println("\tIngredientes: " + recipeIngredients);
        System.out.println("\tTiempo de preparación: " + recipeTimePreparation + " minutos");
        System.out.println("\tDificultad: " + recipeDifficulty);
    }
}
