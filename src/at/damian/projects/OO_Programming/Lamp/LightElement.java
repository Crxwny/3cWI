package at.damian.projects.OO_Programming.Lamp;

public class LightElement {
    private String name;
    private String color;
    private double consumption;
    public enum STATUS{ON, OFF}
    private STATUS status;



    public LightElement(String name, STATUS status, double consumption, String color) {
        this.name = name;
        this.status = status;
        this.consumption = consumption;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public void turnOn() {
        this.status = STATUS.ON;
    }

    public void turnOff() {
        this.status = STATUS.OFF;
    }

    @Override
    public String toString() {
        return "LightElement{" +
                "name='" + name + '\'' +
                '}';
    }
}
