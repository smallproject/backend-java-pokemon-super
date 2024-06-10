package src;

public class Charmander extends FirePokemon{
    public Charmander(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    public Charmander(double healthPoint, double experiencePoints, String name
            , int level, double attack, double defence, double accuracy, double weight, double height) {
        super(healthPoint, experiencePoints, name, level, attack, defence, accuracy, weight, height);

    }
    @Override
    public void speaks() {
        System.out.println("Charrrr");
    }

    @Override
    public void eats(String food) {

    }

    @Override
    public void attack() {

    }
}
