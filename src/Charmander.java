package src;

public class Charmander extends FirePokemon{
    public Charmander(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    @Override
    public void speaks() {
        System.out.println("Charrrr");
    }

    @Override
    public void eats(String food) {

    }
}
