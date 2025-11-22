package animales;

public class Animal
{
    protected void hacerSonido()
    {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal
{
    @Override
    protected void hacerSonido()
    {
        System.out.println("El perro hace wauf");
    }
}

class Gato extends Animal
{
    @Override
    protected void hacerSonido()
    {
        System.out.println("El gato hace miau");
    }
}


class PruebaAnimal
{
    // Metodo Polimorfico
    static  void imprimirSonido(Animal animal)
    {
        animal.hacerSonido();
    }

    public static void main(String[] args)
    {
        // Objeto de la clase padre (Animal)
        // Animal animal = new Animal();
        // Perro animal = new Perro();
        Gato animal = new Gato();
        imprimirSonido(animal);
    }
}