import java.util.ArrayList;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    // Конструктор музыкальных постановок
    public MusicalShow(String title, long duration, Director director, ArrayList<Actor> listOfActors,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Печатаем либретто
    public void printLibretto() {
        System.out.println("Либретто: " + librettoText);
    }
}
