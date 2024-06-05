package src;

public class Bulbasaur extends GrassPokemon{
    public Bulbasaur(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    @Override
    public void speaks() {
        System.out.println("Bulbasaur!");
    }

    @Override
    public void eats(String food) {

    }
}
