package at.damian.projects.tests;

public class Car extends Vehicle {

    public Car(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void drive() {
        System.out.println(this.getID() + " Car is driving");
    }


}

