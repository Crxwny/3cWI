package at.damian.projects.OO_Programming.Zusatzaufgabe;

import java.util.ArrayList;

public class TrafficController {
    private ArrayList<Plane> planes = new ArrayList<>();

    public TrafficController() {
        this.planes = planes;
    }

    public void printAllPlanes() {
        if (planes == null) {
            return;
        }
        for (Plane p : planes) {
            System.out.println(p.getName());
        }
    }

    public void informPeopleOnAllPlanes(String message) {
        if (planes == null) {
            return;
        }
        for (Plane p : planes) {
            p.informPassengers(message);
        }
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }
}
