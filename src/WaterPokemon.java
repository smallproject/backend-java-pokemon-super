package src;

public abstract class WaterPokemon extends Pokemon {
    private String type;
    public WaterPokemon(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    public WaterPokemon(double healthPoint, double experiencePoints, String name
            , int level, double attack, double defence, double accuracy, double weight, double height) {
        super(healthPoint, experiencePoints);

        this.setName(name);
        this.setLevel(level);
        this.setAttack(attack);
        this.setDefence(defence);
        this.setAccuracy(accuracy);
        this.setWeight(weight);
        this.setHeight(height);

        this.type = "water";
    }
    public void surf() {

    }

    public void hydroPump() {

    }

    public void hydroCanon() {

    }

    public void rainDance() {

    }
}
