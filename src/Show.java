import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле «" + title + "».");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " теперь участвует в спектакле «" + title + "»!");
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + surnameToReplace + " в спектакле «" + title + "» успешно заменен на: " + newActor + ".");
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surnameToReplace + " в спектакле «" + title + "» не найден.");
    }

    public void printActors() {
        System.out.println("Актёры спектакля «" + title + "»:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    @Override
    public String toString() {
        return "Спектакль «" + title + "», " + duration + " мин., режиссёр: " + director;
    }
}

