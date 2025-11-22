package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivo implements IServicioSnacks
{
    private final String NOMBRE_ARCHIVO = "snacks.txt";
    // Crear la lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    // Constructor clase
    public ServicioSnacksArchivos()
    {

    }

    @Override
    public void agregarSnack(Snack snack)
    {

    }

    @Override
    public void mostrarSnacks()
    {

    }

    @Override
    public List<Snack> getSnacks()
    {
        return List.of();
    }
}
