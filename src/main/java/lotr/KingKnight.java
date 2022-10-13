package lotr;

public class KingKnight extends Character{
    public KingKnight(int min, int max) {
        super(min, max);
        int power = (min + (int) (Math.random() * (max-min+1)));
        setPower(power);
        int hp = (min + (int) (Math.random() * (max-min+1)));
        setHp(hp);

    }

    @Override
    public void kick(Character c) {
//        System.out.println("nnn");
        c.setHp(c.getHp() - (int) (Math.random() * getPower()));
    }
}
