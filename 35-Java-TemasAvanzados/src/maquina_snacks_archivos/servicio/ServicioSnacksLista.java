package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks
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

    public void agregarSnack(Snack snack)
    {
        snacks.add(snack);
    }

    public void mostrarSnacks()
    {
        StringBuilder inventarioSnacks = new StringBuilder();
        for (Snack snack : snacks)
            inventarioSnacks.append(snack.toString()).append("\n");

        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }

    public List<Snack> getSnacks()
    {
        return snacks;
    }
}
