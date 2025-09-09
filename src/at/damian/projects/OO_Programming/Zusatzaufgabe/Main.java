package at.damian.projects.OO_Programming.Zusatzaufgabe;

public class Main {
    public static void main(String[] args) {
        Position position1 = new Position(48.2082, 16.3738);
        Position position2 = new Position(40.7128, -74.0060);

        Passenger passenger1 = new Passenger("John", "Doe");
        Passenger passenger2 = new Passenger("Jane", "Smith");
        Passenger passenger3 = new Passenger("Alice", "Johnson");
        Passenger passenger4 = new Passenger("Bob", "Brown");

        Plane plane1 = new Plane("Flight 101");
        Plane plane2 = new Plane("Flight 202");

        TrafficController trafficController = new TrafficController();

        plane1.addPassenger(passenger1);
        plane1.addPassenger(passenger2);
        plane1.addPosition(position1);
        trafficController.addPlane(plane1);
        plane2.addPassenger(passenger3);
        plane2.addPassenger(passenger4);
        plane2.addPosition(position2);
        trafficController.addPlane(plane2);

        trafficController.printAllPlanes();
        trafficController.informPeopleOnAllPlanes("This is a test message for all passengers.");
    }
}
