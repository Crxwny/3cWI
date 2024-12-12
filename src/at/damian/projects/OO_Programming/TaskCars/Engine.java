package at.damian.projects.OO_Programming.TaskCars;

import java.util.Scanner;

public class Engine {
    Scanner scanner = new Scanner(System.in);

    public enum TYPE {Diesel, Gas}

    ;
    private TYPE type;
    private int horsePower;

    public Engine(TYPE type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(Car car) {
        if (car.getFuelAmount() - car.getConsumption() > 0) {
            System.out.print("Driving speed: ");
            this.horsePower = scanner.nextInt();
            if (this.horsePower > car.getMaxSpeed()) {
                System.out.println("Extends max speed");
                return;
            } else {
                System.out.print("Duration: ");
                int duration = scanner.nextInt();
                car.setDrivenKilometers(car.getDrivenKilometers() + this.getHorsePower() * duration);
                car.setFuelAmount(car.getFuelAmount() - car.getConsumption());
                System.out.println("I am driving with " + this.getHorsePower() + " km/h for " + duration + " seconds");
            }
            } else{
            System.out.println("No fuel left to drive");
        }
    }
}
