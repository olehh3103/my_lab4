package lotr;
import lotr.*;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("\nThere are two players on " +
                "the battlefield, player number 1 - " +
                c1.getClass().getSimpleName() + "\n" +
                "and the player number 2 - " +
                c2.getClass().getSimpleName() +
                ".");
        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            System.out.println("you cannot play against each other");
        } else {
            int counter = 0;
            while (c1.isAlive() && c2.isAlive()) {
                if (counter % 2 == 0) {
                    System.out.println("p1");
                    c1.kick(c2);
                    if (!c1.isAlive()) {
                        System.out.println(c2.getClass().getSimpleName() +
                                " 2, you have won! " +
                                "What gym do you go to?");
                    } else if (c2.isAlive()) {
                        System.out.println(c1.getClass().getSimpleName() +
                                " 1, you should go to the gym");
                    } else {
                        System.out.println(c1.getClass().getSimpleName() +
                                " 1, you have won! " +
                                "What gym do you go to?");
                    }
                } else if (counter % 2 == 1) {
                    System.out.println("p2");

                    c2.kick(c1);
                    if (!c2.isAlive()) {
                        System.out.println(c1.getClass().getSimpleName() +
                                " 1, you have won! " +
                                "What gym do you go to?");
                    } else if (c1.isAlive()) {
                        System.out.println(c2.getClass().getSimpleName() +
                                " 2, you should go to the gym");
                    } else {
                        System.out.println(c2.getClass().getSimpleName() +
                                " 2, you have won! " +
                                "What gym do you go to?");
                    }
                }
                counter += 1;
            }
        }
    }

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character player_1 = factory.createCharacter();
        Character player_2 = factory.createCharacter();
//        Hobbit my1 = new Hobbit();
//        Hobbit my2 = new Hobbit();

//        King my2 = new King();
//        fight(my1, my2);

        fight(player_1, player_2);

    }
}
