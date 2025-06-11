package at.damian.projects.tests.test_02;

public class Film extends Medium {
    private float duration;

    public Film(int id, String title, float price, String description, float duration) {
        super(id, title, price, description);
        this.duration = duration;
    }

    public float getDuration() {
        return duration;
    }
}
