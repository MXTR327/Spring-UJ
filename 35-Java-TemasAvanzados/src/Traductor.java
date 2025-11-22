public interface Traductor
{
    // public y abstract
    void traducir();

    // Metodos con implementacion por default
    default void inciarTraductor()
    {
        System.out.println("Iniciando Traductor...");
    }
}

class Ingles implements Traductor
{
    @Override
    public void traducir()
    {
        System.out.println("Traducir Ingles");
    }
}

class Frances implements Traductor
{
    @Override
    public void traducir()
    {
        System.out.println("Traducir Frances");
    }

    @Override
    public void inciarTraductor()
    {
        System.out.println("Iniciando Traductor Frances");
    }
}

class PruebaTraductor
{
    public static void main(String[] args)
    {
        Traductor ingles = new Ingles();
        ingles.inciarTraductor();
        ingles.traducir();

        Traductor frances = new Frances();
        frances.inciarTraductor();
        frances.traducir();
    }
}