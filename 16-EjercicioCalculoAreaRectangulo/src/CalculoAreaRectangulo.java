import java.util.Scanner;

public class CalculoAreaRectangulo
{
    public static void main(String[] args)
    {
        System.out.println("*** Cálculo del Área de un Rectángulo ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Realizar calculo del area
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);

        // Realizar calculo del perimetro
        double perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
