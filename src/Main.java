package src;

public class Main {
    public static void main(String[] args) {

        Pikachu pikachu = new Pikachu(100, 0, "Yellow",
        1, 2, 1.5, 3, 4,3.2);

        pikachu.speaks();
        pikachu.attack();

        pikachu.getStats();
    }

    public static void temp() {

        Bulbasaur bulbasaur = new Bulbasaur(100, 0, "Green",
                1, 1.5, 1.5, 3, 3,3);
        bulbasaur.speaks();

        Charmander charmander = new Charmander(100, 0, "Red",
                1, 3, 1, 2, 4,3.5);
        charmander.speaks();

        Squirtle squirtle = new Squirtle(100, 0, "Blue",
                1, 1.5, 4, 2, 5,3.3);
        squirtle.speaks();
    }
}
