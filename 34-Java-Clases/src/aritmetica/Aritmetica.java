package aritmetica;

public class Aritmetica
{
    private double operando1;
    private double operando2;

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

    public void sumar()
    {
        double resultado = operando1 + operando2;
        System.out.printf("Resultado Suma: %.2f%n", resultado);
    }

    public void restar()
    {
        double resultado = operando1 - operando2;
        System.out.printf("Resultado Resta: %.2f%n", resultado);
    }

    public double getOperando1()
    {
        return operando1;
    }

    public void setOperando1(double operando1)
    {
        this.operando1 = operando1;
    }

    public double getOperando2()
    {
        return operando2;
    }

    public void setOperando2(double operando2)
    {
        this.operando2 = operando2;
    }
}
