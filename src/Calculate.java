package src;

public class Calculate {
    private double attack;
    private double defense;
    private double accuracy;
    private String special;

    public Calculate (double attack, double defence, double accuracy, String special) {
        this.attack = attack;
        this.defense = defence;
        this.accuracy = accuracy;
        this.special = special;
    }

    public void calculateAttack(Pokemon attacker, Pokemon defender) {
        double healthpoints = defender.getHealthPoint() - (attacker.getAttack() - defender.getDefence());
    }


    public void damageCalculator()
    {
        System.out.println("Attack: " + attack + " Defense: " + defense + " Accuracy: " + accuracy + " Special: " + special);

    }
}
