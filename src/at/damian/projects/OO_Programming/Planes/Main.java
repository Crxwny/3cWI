package at.damian.projects.OO_Programming.Planes;

public class Main {
    public static void main(String[] args) {
        TrafficController controller = new TrafficController();

        Plane plane1 = new Plane("Airbus A320", new Position(48.1351, 11.5820));
        plane1.addPassenger(new Passenger("John", "Doe"));
        plane1.addPassenger(new Passenger("Jane", "Smith"));

        Plane plane2 = new Plane("Boeing 747", new Position(40.7128, -74.0060));
        plane2.addPassenger(new Passenger("Alice", "Brown"));

        controller.addPlane(plane1);
        controller.addPlane(plane2);

        controller.printAllPlanes();
        controller.informPeopleOnAllPlanes();
    }
}
