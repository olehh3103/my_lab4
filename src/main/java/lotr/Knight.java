package lotr;

public class Knight extends KingKnight{
    public Knight(){
        super(2, 12);
    }

    @Override
    public String toString() {
        return "Knight{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
