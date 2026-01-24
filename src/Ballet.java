import java.util.ArrayList;

public class Ballet extends MusicalShow {
    protected Person choreographer;

    // Конструктор балета
    public Ballet(String title, long duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
