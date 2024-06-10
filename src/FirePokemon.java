package src;

public abstract class FirePokemon extends Pokemon {

    private String type;
    public FirePokemon(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    public FirePokemon(double healthPoint, double experiencePoints, String name
            , int level, double attack, double defence, double accuracy, double weight, double height) {
        super(healthPoint, experiencePoints);

        this.setName(name);
        this.setLevel(level);
        this.setAttack(attack);
        this.setDefence(defence);
        this.setAccuracy(accuracy);
        this.setWeight(weight);
        this.setHeight(height);

        this.type = "fire";
    }
    public void inferno() {

    }

    public void pyroBall() {

    }

    public void fireLash() {

    }

    public void flameThrower() {

    }
}
