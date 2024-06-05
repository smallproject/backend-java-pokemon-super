package src;

public class Pikachu extends ElectricPokemon{

    public Pikachu(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    @Override
    public void speaks() {
        System.out.println("Pikapi");
    }

    @Override
    public void eats(String food) {
        System.out.println("Eats " + food);
    }

    public void speak() {
        System.out.println("Pika pika!");
    };
}
