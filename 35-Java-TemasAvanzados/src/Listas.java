import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas
{
    public static void main(String[] args)
    {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        System.out.println("*** Iteracion fori ***");
        for (String elemento : miLista)
            System.out.println("Dia de la semana: " + elemento);

        System.out.println();

        System.out.println("*** Iteracion lambda ***");
        // Funciones lambda (funcion anonima de codigo muy compacto)
        miLista.forEach(elemento -> System.out.printf("Elemento: %s%n", elemento));

        System.out.println();

        System.out.println("*** Iteracion method reference ***");
        miLista.forEach(System.out::println);

        System.out.println();

        System.out.println("*** Listas inmutables ***");
        List<String> nombres = Arrays.asList("Pedro", "Ivonme", "Nohemi");
        nombres.forEach(System.out::println);

    }
}
