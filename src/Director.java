public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" // Имя класса
                + "name=" + super.getName() + ", " // Имя режиссёра
                + "surname=" + super.getSurname() + ", " // Фамилия режиссёра
                + "gender=" + super.getGender() + ", " // Пол режиссёра
                + "numberOfShows=" + numberOfShows // Количество спектаклей
                + "}";
    }
}