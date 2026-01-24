import java.util.ArrayList;

public class Opera extends MusicalShow {
    protected int choirSize;

    // Конструктор оперы
    public Opera(String title, long duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
