public class Aritmetica
{
    double operando1;
    double operando2;

    public Aritmetica()
    {
    }

    public Aritmetica(double operando1, double operando2)
    {
        System.out.println("Ejecutando Constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.printf("Dir. Mem Operador this: %s%n", this);
    }

    void sumar()
    {
        double resultado = operando1 + operando2;
        System.out.printf("Resultado Suma: %.2f%n", resultado);
    }

    void restar()
    {
        double resultado = operando1 - operando2;
        System.out.printf("Resultado Resta: %.2f%n", resultado);
    }

    public static void main(String[] args)
    {
        System.out.println("*** Ejemplo Aritmetica ***");
        // Cremos Primer Objeto
        Aritmetica aritmetica1 = new Aritmetica(5, 7);
        aritmetica1.sumar();
        aritmetica1.restar();

        // Constructor vacio
        Aritmetica aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();
    }
}
