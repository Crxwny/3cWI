package at.damian.projects.tests;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Bob", 1);
        System.out.println(c1.getName());

        AeroCar a1 = new AeroCar("Billy", 2);
        a1.fly();

        Train t1 = new Train("Joe", 3);

        CarDealer carDealer = new CarDealer();
        carDealer.addVehicle(c1);
        carDealer.addVehicle(t1);
        carDealer.printAllVehicles();
    }
}
