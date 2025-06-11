package at.damian.projects.tests.test_01;

public class Train extends Vehicle {
    public Train(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void drive() {
        System.out.println(this.getID() + " Train is driving");
    }
}
