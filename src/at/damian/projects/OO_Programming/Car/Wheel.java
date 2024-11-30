package at.damian.projects.OO_Programming.Car;

public class Wheel {
    private String color;
    private int pessure;


    public Wheel(String color, int pessure) {
        this.color = color;
        this.pessure = pessure;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPessure() {
        return pessure;
    }

    public void setPessure(int pessure) {
        this.pessure = pessure;
    }
}
