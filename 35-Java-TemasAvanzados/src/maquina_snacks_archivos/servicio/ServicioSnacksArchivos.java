package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks
{
    private final String      NOMBRE_ARCHIVO = "snacks.txt";
    // Crear la lista de snacks
    private       List<Snack> snacks         = new ArrayList<>();

    // Constructor clase
    public ServicioSnacksArchivos()
    {
        // Creamos el archivo si no existe
        File    archivo = new File(NOMBRE_ARCHIVO);
        boolean existe  = false;
        try
        {
            existe = archivo.exists();
            if (existe)
            {
                this.snacks = obtenerSnacks();
            }
            else // Creamos el archivo
            {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // Guarda el archivo en disco
                System.out.println("Se ha creado el archivo");

            }
        }
        catch (Exception e)
        {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
        // Si no existe el archivo, cargamos algunos snacks iniciales
        if (!existe)
            cargarSnacksIniciales();
    }

    private void cargarSnacksIniciales()
    {
        agregarSnack(new Snack("Papas", 70));
        agregarSnack(new Snack("Refresco", 50));
        agregarSnack(new Snack("Sandwich", 120));
    }

    private List<Snack> obtenerSnacks()
    {
        ArrayList snacks = new ArrayList<>();
        try
        {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas)
            {
                String[] lineaSnack = linea.split(","); // parseo separado por coma
                String   idSnack    = lineaSnack[0]; // No se usa
                String   nombre     = lineaSnack[1];
                double   precio     = Double.parseDouble(lineaSnack[2]);
                var      snack      = new Snack(nombre, precio);
                snacks.add(snack); // Agregamos el snack leido a la lista
            }
        }
        catch (Exception e)
        {
            System.out.println("Error al leer archivo de snacks: " + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack)
    {
        // Agregamos el nuevo snack, 1. a la lista en memoria
        // 1. Se guarda en la lista en memoria
        snacks.add(snack);
        // 2. Guardamos el nuevo snack en el archivo
        agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack)
    {
        boolean anexar  = false;
        File    archivo = new File(NOMBRE_ARCHIVO);
        try
        {
            anexar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close(); // se escribe la informacion al archivo
        }
        catch (Exception e)
        {
            System.out.println("Error al agregar snack: " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks()
    {
        System.out.println("--- Snacks en el Inventario ---");
        // Mostramos la lista de snacks en el archivo
        StringBuilder inventarioSnacks = new StringBuilder();
        for (Snack snack : snacks)
        {
            inventarioSnacks.append(snack.toString()).append("\n");
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks()
    {
        return snacks;
    }
}
