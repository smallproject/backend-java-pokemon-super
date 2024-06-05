package src;

public abstract class Attribute {
    private double healthPoint;
    private double experiencePoints;

    private String name;
    private int level;
    private double height;
    private double weight;
    private double defence;
    private double attack;
    private double accuracy;
    private String special;


    public abstract void speaks();
    public abstract void eats(String food);

    public void setExperiencePoints(double experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public Attribute(double healthPoint, double experiencePoints) {
        this.healthPoint = healthPoint;
        this.experiencePoints = experiencePoints;
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getExperiencePoints() {
        return experiencePoints;
    }

    public void getExperiencePoints(double experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}
