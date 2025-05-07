package at.damian.projects.tests;

public abstract class Vehicle {
    private String name;
    private int ID;

    public Vehicle(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract void drive();

    public String getName() {
       return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
