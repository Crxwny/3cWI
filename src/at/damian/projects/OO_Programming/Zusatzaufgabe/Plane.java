package at.damian.projects.OO_Programming.Zusatzaufgabe;

import java.util.ArrayList;

public class Plane {
    private String name;
    private Position position;
    private ArrayList<Passenger> passengerList = new ArrayList<>();

    public Plane(String name) {
        this.name = name;
        this.position = position;
        this.passengerList = passengerList;

    }

    public void informPassengers(String message) {
        if (passengerList == null) {
            return;
        }
        for (Passenger p : passengerList) {
            p.inform(message);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void addPassenger(Passenger passenger) {
        this.passengerList.add(passenger);
    }

    public void addPosition(Position position) {
        this.position = position;
    }


}
