package at.damian.projects.OO_Programming.Planes;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String name;
    private Position position;
    private List<Passenger> passengers;

    public Plane(String name, Position position) {
        this.name = name;
        this.position = position;
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void informPassengers() {
        passengers.forEach(passenger -> passenger.inform());
    }

    public String getName() {
        return name;
    }
}
