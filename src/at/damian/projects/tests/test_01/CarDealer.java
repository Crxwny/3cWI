package at.damian.projects.tests.test_01;

import java.util.ArrayList;

public class CarDealer {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public CarDealer() {
        this.vehicles = vehicles;
    }

    public void printAllVehicles() {
       for (Vehicle v : vehicles) {
           System.out.println(v.getName());
       }
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
