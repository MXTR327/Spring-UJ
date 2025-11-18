public class ManejoSubCadenas
{
    public static void main(String[] args)
    {
        // Tema de subcadenas
        // Substring (inicio, fin (sin incluirlo))
        var cadena1 = "Hola mundo";
        System.out.println("cadena1 = " + cadena1);

        // Subcadena
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);

        // Obtener la palabra mundo
        var subcadena2 = cadena1.substring(5, 10);
        System.out.println("subcadena2 = " + subcadena2);

        // Obtener la palabra mundo a partir del indice 5
        var subcadena3 = cadena1.substring(5);
        System.out.println("subcadena3 = " + subcadena3);
    }
}
