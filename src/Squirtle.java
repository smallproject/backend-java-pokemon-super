package src;

public class Squirtle extends WaterPokemon{
    public Squirtle(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }


    public Squirtle(double healthPoint, double experiencePoints, String name
            , int level, double attack, double defence, double accuracy, double weight, double height) {
        super(healthPoint, experiencePoints, name, level, attack, defence, accuracy, weight, height);

    }
    @Override
    public void speaks() {
        System.out.println("Squirtle!");
    }

    @Override
    public void eats(String food) {

    }

    @Override
    public void attack() {

    }
}
