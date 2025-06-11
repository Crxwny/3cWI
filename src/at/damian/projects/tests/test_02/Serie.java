package at.damian.projects.tests.test_02;

public class Serie extends Medium {
    public Serie(int id, String title, float price, String description) {
        super(id, title, price, description);
    }

    public void playTrailer() {
        System.out.println("Playing trailer of " + getTitle());
    }
}
