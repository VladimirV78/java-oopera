import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("🎭 Начинаем представление!");

        // Создаём трёх актёров
        Actor actor1 = new Actor("Дальвин", "Щербаков", Gender.MALE,180);
        Actor actor2 = new Actor("Нина", "Шацкая", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Алексей", "Трофимов", Gender.MALE,175);

        // Создаём двух режиссёров
        Director director1 = new Director("Елена", "Козлова", Gender.FEMALE, 17);
        Director director2 = new Director("Юрий", "Любимов", Gender.MALE, 21);

        // Создаем композитора
        Person musicAuthor = new Person("Петр", "Чайковский", Gender.MALE);

        // Создаем хореографа
        Person choreographer = new Person("Сергей", "Прокофьев", Gender.MALE);

        // Создаем обычный спектакль
        Show show = new Show("Мастер и Маргарита", 190, director2,
                new ArrayList<Actor>(){{
                    add(actor1);
                    add(actor2);
        }});

        // Выводим список актеров спектакля
        System.out.println("\nСписок актеров спектакля: " + show.getTitle());
        System.out.println(show.getActors());

        // Создаем оперу
        Opera opera = new Opera("Пиковая дама", 150, director1,
                new ArrayList<Actor>(){{
                    add(actor2);
                    add(actor3);
        }}, musicAuthor, "Действие оперы происходит в Петербурге в конце XVIII века. " +
                        "Главный персонаж — военный инженер Германн, одержимый страстью к игре в карты.", 18);

        // Выводим список актеров оперы
        System.out.println("\nСписок актеров оперы: " + opera.getTitle());
        System.out.println(opera.getActors());

        // Создаем балет
        Ballet ballet = new Ballet("Ромео и Джульетта", 130, director1,
                new ArrayList<Actor>(){{
                    add(actor1);
                    add(actor3);
        }}, musicAuthor, "Балет рассказывает о несчастной любви юноши и девушки из враждующих семей.",
                choreographer);

        // Выводим список актеров балета
        System.out.println("\nСписок актеров балета: " + ballet.getTitle());
        System.out.println(ballet.getActors());

        // Заменяем одного актера на другого
        System.out.println("\nМеняем список актеров оперы: " + opera.getTitle());
        System.out.println(opera.getActors());
        System.out.println("Меняем 'Нину Шацкую' на 'Дальвина Щербакова'");
        opera.replaceActorByLastName(actor1, "Шацкая");
        System.out.println("Новый список актеров оперы: " + opera.getTitle());
        System.out.println(opera.getActors());

        // Заменяем несуществующего актера на другого
        System.out.println("\nМеняем список актеров балета: " + ballet.getTitle());
        System.out.println(ballet.getActors());
        System.out.println("Меняем 'Нину Шацкую' на 'Дальвина Щербакова'");
        ballet.replaceActorByLastName(actor1, "Шацкая");
        System.out.println("Новый список актеров балета: " + ballet.getTitle());
        System.out.println(ballet.getActors());

        // Выводим текст либретто для оперы
        System.out.println("\nТекст либретто для оперы: " + opera.getTitle());
        opera.printLibretto();

        // Выводим текст либретто для балета
        System.out.println("\nТекст либретто для балета: " + ballet.getTitle());
        ballet.printLibretto();
    }
}
