public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String tittle, int duration, Director director, Person musicAuthor, String librettoText, int choirSize) {
        super(tittle, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void printChoirSize() {
        System.out.println("Количество людей в хоре: " + choirSize + ".");
    }

    @Override
    public String toString() {
        return  super.toString() + ", хор: " + choirSize + " чел., композитор: " + getMusicAuthor() + ".";
    }
}
