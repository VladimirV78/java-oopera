import java.util.Objects;

public class Actor extends Person {
    protected int height;

    // Конструктор актера
    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getSurname() + " (рост: " + height + " см)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Actor actor = (Actor) o;
        if (!(o instanceof Actor actor)) return false;
        return super.equals(o) && (height == actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}