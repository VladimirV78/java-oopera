import java.util.ArrayList;

public class Show {
    protected String title;
    protected long duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    // Конструктор спектакля
    public Show(String title, long duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    // Возвращаем список актеров
    public ArrayList<Actor> getActors() {
        return new ArrayList<>(listOfActors);
    }

    // Добавляем актера в спектакль
    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Актёр не может быть null");
            return;
        }

        if (listOfActors.contains(actor)) {
            System.out.println("Предупреждение: Актёр " + actor + " уже добавлен в спектакль.");
            return;
        }

        listOfActors.add(actor);
    }

    // Заменяем одного актера на другого
    public void replaceActorByLastName(Actor newActor, String surNameToReplace) {
        if (newActor == null) {
            System.out.println("Новый актёр не может быть null");
            return;
        }

        if (surNameToReplace == null || surNameToReplace.trim().isEmpty()) {
            System.out.println("Фамилия для замены не может быть пустой или null");
            return;
        }

        for (Actor actor : listOfActors) {
            if (surNameToReplace.equals(actor.getSurname())) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                return;
            }
        }

        System.out.println("Предупреждение: Актёр с фамилией '" + surNameToReplace + "' не найден в спектакле.");
    }

    public String getTitle() {
        return title;
    }
}
