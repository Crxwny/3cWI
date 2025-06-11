package at.damian.projects.tests.test_02;

public abstract class Medium {
    private int id;
    private String title;
    private float price;
    private String description;

    public Medium(int id, String title, float price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
