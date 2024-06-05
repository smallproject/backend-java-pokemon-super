package src;

public class Main {
    public static void main(String[] args) {

        Pikachu pikachu = new Pikachu(100, 0);
        pikachu.setName("Yellow");
        pikachu.setLevel(1);
        pikachu.setAttack(2);
        pikachu.setDefence(1.5);
        pikachu.setWeight(3);
        pikachu.setAccuracy(4);

        pikachu.speaks();


        Bulbasaur bulbasaur = new Bulbasaur(100, 0);
        bulbasaur.setName("Green");
        bulbasaur.setLevel(1);
        bulbasaur.setAttack(1.5);
        bulbasaur.setDefence(1.5);
        bulbasaur.setWeight(3);
        bulbasaur.setAccuracy(3);

        bulbasaur.speaks();

        Charmander charmander = new Charmander(100, 0);
        charmander.setName("Red");
        charmander.setLevel(1);
        charmander.setAttack(3);
        charmander.setDefence(1);
        charmander.setWeight(4);
        charmander.setAccuracy(2);

        charmander.speaks();

        Squirtle squirtle = new Squirtle(100, 0);
        squirtle.setName("Blue");
        squirtle.setLevel(1);
        squirtle.setAttack(1);
        squirtle.setDefence(3);
        squirtle.setWeight(5);
        squirtle.setAccuracy(2);

        bulbasaur.speaks();
    }
}
