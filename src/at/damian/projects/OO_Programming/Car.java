package at.damian.projects.OO_Programming;

public class Car {
    // Instanz / Gedächtnisvariablen

    // don't do that later
    public int fuelTank;
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

    // Methoden
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void doBreak() {
        String brake = "Ich bremse";
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

    public void getRemainingRange() {
        int remainingRange = this.fuelAmount - this.fuelConsumption;
    }
}
