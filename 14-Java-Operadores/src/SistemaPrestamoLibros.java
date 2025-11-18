import java.util.Scanner;

public class SistemaPrestamoLibros
{
    public static void main(String[] args)
    {
        System.out.println("*** Sistema de Prestamo de Libros ***");

        final int DISTANCIA_PERMITIDA_KM = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuentas con credencial de estudiante (true/false)?: ");
        boolean tienesCredencial = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("A cuantos km vives de la biblioteca?: ");
        int distanciaBibliotecaKm = Integer.parseInt(scanner.nextLine());

        boolean esElegiblePrestamo = tienesCredencial || distanciaBibliotecaKm < DISTANCIA_PERMITIDA_KM;

        System.out.print("Eres elegible para prestamo de libros?: " + esElegiblePrestamo);
    }
}
