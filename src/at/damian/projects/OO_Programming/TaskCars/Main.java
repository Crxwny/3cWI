package at.damian.projects.OO_Programming.TaskCars;

public class Main {
    public static void main(String[] args) {
        Producer p1 = new Producer("Mercedes", 20, "Bulgaria");
        Producer p2 = new Producer("Audi", 15, "Germany");
        Producer p3 = new Producer("NejoDrive", 90, "Everywhere");

        Engine e1 = new Engine(Engine.TYPE.Gas, 100);
        Engine e2 = new Engine(Engine.TYPE.Diesel, 120);

        Car c1 = new Car("white", 200, 120, 50, e2, p3, 200);
        Car c2 = new Car("black", 150, 300, 70, e1, p3, 250);

        System.out.println(c2.getProducer());
        System.out.println(c2.getPrice());
        System.out.println(c2.getDrivenKilometers());
        System.out.println(c2.getFuelAmount());
        e2.drive(c2);
        System.out.println(c2.getBaseConsumption());
        System.out.println(c2.getConsumption());
        System.out.println(c2.getDrivenKilometers());
        System.out.println(c2.getFuelAmount());




    }
}
