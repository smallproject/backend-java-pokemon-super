package src;

public class Pikachu extends ElectricPokemon{

    public Pikachu(double healthPoint, double experiencePoints) {
        super(healthPoint, experiencePoints);
    }

    public Pikachu(double healthPoint, double experiencePoints, String name
            , int level, double attack, double defence, double accuracy, double weight, double height) {
        super(healthPoint, experiencePoints, name, level, attack, defence, accuracy, weight, height);

    }
        @Override
    public void speaks() {
        System.out.println("Pikapi");
    }

    @Override
    public void eats(String food) {
        System.out.println("Eats " + food);
    }

    @Override
    public void attack() {
        int choice = 1; //temporary

        switch(choice) {
            case 1:
                thunder(this.getAttack(),this.getAccuracy(), this.getSpecial());
                break;

            case 2:
                electroBall(this.getAttack(),this.getAccuracy(), this.getSpecial());
                break;

            case 3:
                thunderPunch(this.getAttack(),this.getAccuracy(), this.getSpecial());
                break;

            case 4:
                voltTackle(this.getAttack(),this.getAccuracy(), this.getSpecial());
                break;
        }


    }
}
