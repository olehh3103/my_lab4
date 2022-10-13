package lotr;
        import static java.lang.Math.random;

public class King extends KingKnight{
    public King() {
        super(5, 15);
    }
    @Override
    public String toString() {
        return "King{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

}
