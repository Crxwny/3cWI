package at.damian.projects.OO_Programming.Planes;

import java.util.ArrayList;
import java.util.List;


public class TrafficController {
    private List<Plane> planes;

    public TrafficController() {
        this.planes = new ArrayList<Plane>();
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void printAllPlanes() {
        planes.forEach(plane -> System.out.println("Plane: " + plane.getName()));
    }

    public void informPeopleOnAllPlanes() {
        for (Plane plane : planes) {
            plane.informPassengers();
        }
    }
}
