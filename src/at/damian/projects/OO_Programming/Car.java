package at.damian.projects.OO_Programming;

public class Car {
    // Instanz / Gedächtnisvariablen

    // don't do that later
    private int fuelTank;
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;

    public Car () {};

    public Car(int fuelTank, int fuelConsumption, int fuelAmount, String brand, String serialNumber, String color) {
        this.fuelTank = fuelTank;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
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

    // Methoden
    public void drive() {
        if (this.fuelAmount - this.fuelConsumption >= 0) {
            this.fuelAmount = this.fuelAmount - fuelConsumption;
            System.out.println("I am driving");
        } else {
            System.out.println("No fuel left to drive");
            return;

        }
    }


    public void doBreak() {
        String brake = "Hitting the brake";
        System.out.println(brake);


    }

    public void turboBoost() {
        if (this.fuelAmount > this.fuelTank*0.1) {
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
        System.out.println("Remaining Fuel: "+remainingRangeFuel);
    }
}
