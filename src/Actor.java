import java.util.Objects;
import java.util.StringTokenizer;

public class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Actor other = (Actor) obj;
        return height == other.height;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
    @Override
    public String toString() {
        return super.toString() + " (" + height + ")";
    }
}
