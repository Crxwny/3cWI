package at.damian.projects.OO_Programming.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
    // Instanz / Gedächtnisvariablen

    Scanner scanner = new Scanner(System.in);
    private int fuelTank;
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private Engine engine;
    private List<RearMirror> mirrors = new ArrayList<>();
    private List<Wheel> wheels = new ArrayList<>();

    ;

    public Car() {
    }

    public Car(Engine engine, int fuelTank, int fuelConsumption, int fuelAmount, String brand, String serialNumber, String color) {
        this.fuelTank = fuelTank;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.engine = engine;
        this.mirrors = new ArrayList<>();
        this.wheels = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public void addWheel(Wheel wheel) {
        this.wheels.add(wheel);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Methoden
    public void drive() {
        if (this.fuelAmount - this.fuelConsumption > 0) {
            System.out.print("Driving speed: ");
            this.engine.setSpeed(scanner.nextInt());
            this.fuelAmount = this.fuelAmount - fuelConsumption;
            System.out.println("I am driving with " + this.engine.getSpeed() + " km/h");
        } else {
            System.out.println("No fuel left to drive");
        }
    }


    public void doBreak() {
        String brake = "Hitting the brake";
        System.out.println(brake);
    }

    public void turboBoost() {
        if (this.fuelAmount > this.fuelTank * 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go SuperBoost");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRangeFuel() {
        int remainingRangeFuel = this.fuelAmount - this.fuelConsumption;
        if (remainingRangeFuel > 0) {
            System.out.println("Remaining Fuel after driving: " + remainingRangeFuel);

        } else {
            System.out.println("Not enough fuel remaining to drive again (" + remainingRangeFuel + ")");
        }
    }

    public void getInfo() {
        System.out.println("Ich bin ein " + this.getBrand() + ", ich laufe mit " + this.getEngine().getType() + " und ich habe " + this.getEngine().getHorsePower() + " PS");
    }
}
