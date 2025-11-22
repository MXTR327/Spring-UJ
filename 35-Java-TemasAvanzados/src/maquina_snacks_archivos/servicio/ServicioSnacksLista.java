package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class Snacks
{
    private static final List<Snack> snacks;

    // Bloque static inicializador
    static
    {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    public static void agregarSnack(Snack snack)
    {
        snacks.add(snack);
    }

    public static void mostrarSnacks()
    {
        StringBuilder inventarioSnacks = new StringBuilder();
        for (Snack snack : snacks)
            inventarioSnacks.append(snack.toString()).append("\n");

        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }

    public static List<Snack> getSnacks()
    {
        return snacks;
    }
}
