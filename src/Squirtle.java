package src;

public class Squirtle extends WaterPokemon{
    public Squirtle(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    @Override
    public void speaks() {
        System.out.println("Squirtle!");
    }

    @Override
    public void eats(String food) {

    }
}
