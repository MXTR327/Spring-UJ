package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica
{
    public static void main(String[] args)
    {
        System.out.println("*** Ejemplo aritmetica.Aritmetica ***");
        // Cremos Primer Objeto
        Aritmetica aritmetica1 = new Aritmetica(5, 7);
        System.out.printf("Atributo aperando1 %.2f%n", aritmetica1.getOperando1());
        System.out.printf("Atributo aperando2 %.2f%n", aritmetica1.getOperando2());
        aritmetica1.sumar();
        aritmetica1.restar();

        System.out.println();

        // Constructor vacio
        Aritmetica aritmetica2 = new Aritmetica();
        aritmetica2.setOperando1(12);
        aritmetica2.setOperando2(16);
        aritmetica2.sumar();
        aritmetica2.restar();
    }
}
