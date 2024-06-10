package src;

public abstract class GrassPokemon extends Pokemon {

    private String type;
    public GrassPokemon(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    public GrassPokemon(double healthPoint, double experiencePoints, String name
            , int level, double attack, double defence, double accuracy, double weight, double height) {
        super(healthPoint, experiencePoints);

        this.setName(name);
        this.setLevel(level);
        this.setAttack(attack);
        this.setDefence(defence);
        this.setAccuracy(accuracy);
        this.setWeight(weight);
        this.setHeight(height);

        this.type = "grass";
    }

    public void leafStorm() {

    }

    public void leechSeed() {

    }

    public void leafBlade() {

    }

    public void scratch() {

    }

}
