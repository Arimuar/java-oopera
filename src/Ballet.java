public class Ballet extends MusicalShow {
    private final String choreographer;

    public Ballet(String title, int duration, Director director, String musicAuthor,
                  String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    public void printChoreographer() {
        System.out.println("Хореограф спектакля «" + getTitle() + "»: " + choreographer + ".");
    }

    @Override
    public String toString() {
        return  super.toString() + ", хореограф: " + choreographer + ", композитор: " + getMusicAuthor() + ".";
    }
}
