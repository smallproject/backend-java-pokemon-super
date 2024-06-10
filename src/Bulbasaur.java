package src;

public class Bulbasaur extends GrassPokemon{
    public Bulbasaur(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    public Bulbasaur(double healthPoint, double experiencePoints, String name
            , int level, double attack, double defence, double accuracy, double weight, double height) {
        super(healthPoint, experiencePoints, name, level, attack, defence, accuracy, weight, height);

    }
    @Override
    public void speaks() {
        System.out.println("Bulbasaur!");
    }

    @Override
    public void eats(String food) {

    }

    @Override
    public void attack() {

    }
}
