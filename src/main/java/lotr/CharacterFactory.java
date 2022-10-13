package lotr;
import lotr.*;
//import


public class CharacterFactory {
    public Character createCharacter(){
        int num = (int) (Math.random() * 4);
        if (1 == num){
            return new Hobbit();
        } else if (num == 2) {
            return new Elf();
        } else if (num == 3) {
            return new King();
        }
        return new Knight();
    }

    public static void main(String[] args) {
        CharacterFactory my = new CharacterFactory();
        Character new_p = my.createCharacter();
        System.out.println(new_p);
    }
}
