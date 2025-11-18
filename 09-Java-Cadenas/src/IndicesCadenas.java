public class IndicesCadenas
{
    public static void main(String[] args)
    {
        // Manejo de indices de una cadena
        var cadena1 = "Hola mundo";

        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // Recuperar el caracter de H
        System.out.println("primerCaracter = " + primerCaracter);

        // Recuperar el ultimo caracter en la posicion 9
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        // Imprimir la letra M, indice 5
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);

    }
}
