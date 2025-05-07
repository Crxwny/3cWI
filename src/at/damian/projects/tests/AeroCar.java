package at.damian.projects.tests;

public class AeroCar extends Car {
    public AeroCar(String name, int ID) {
        super(name, ID);
    }

    public void fly() {
        System.out.println(this.getID() + " is flying");
    }
}
