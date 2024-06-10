package src;

public abstract class ElectricPokemon extends Pokemon {
    Calculate calculate;

    private String type;
    public ElectricPokemon(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    public ElectricPokemon(double healthPoint, double experiencePoints, String name
                           , int level, double attack, double defence, double accuracy, double weight, double height) {
        super(healthPoint, experiencePoints);

        this.setName(name);
        this.setLevel(level);
        this.setAttack(attack);
        this.setDefence(defence);
        this.setAccuracy(accuracy);
        this.setWeight(weight);
        this.setHeight(height);

        this.type = "electric";
    }

    public double thunderPunch(double attack, double accuracy, String special) {
        return attack = attack * 1.3;
    }

    public void electroBall(double attack, double accuracy, String special) {
        attack = attack * 1.5;
    }

    public void thunder(double attack, double accuracy, String special) {
        attack = attack * 1.3;

        calculate = new Calculate(attack, 0, accuracy, special);
        calculate.damageCalculator();
    }

    public void voltTackle(double attack, double accuracy, String special) {
        attack = attack * 1.3;
    }
}
