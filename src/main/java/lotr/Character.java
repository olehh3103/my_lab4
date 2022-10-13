package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.max;

@AllArgsConstructor
public class Character {
    @Override
    public String toString() {
        return "Character{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

    @Getter
    int hp;
    @Getter @Setter
    int power;


    public void setHp(int new_hp){
        this.hp = max(0, new_hp);
    }

    public boolean isAlive(){
        return getHp() > 0;
    }

    public void kick(Character c){
        c.setHp(c.getHp()-getPower());
    }

    public static void main(String[] args) {
        Character my = new Character(11, 10);
        System.out.println(my);
        Character my2 = new Character(11, 10);
        my2.kick(my);
        System.out.println(my);
        System.out.println(my.isAlive());
        System.out.println((5 + (int) (Math.random() * 11)));

    }
}
