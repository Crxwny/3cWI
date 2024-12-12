package at.damian.projects.OO_Programming.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);

        Wheel w1 = new Wheel("black", 40);
        Wheel w2 = new Wheel("black", 20);
        Wheel w3 = new Wheel("yellow", 10);
        Wheel w4 = new Wheel("yellow", 30);

        Engine e1 = new Engine();
        e1.setType(Engine.TYPE.DIESEL);
        e1.setHorsePower(140);


        Car c1 = new Car();
        c1.setEngine(e1);
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A1234");
        c1.setFuelAmount(70);
        c1.setFuelTank(70);
        c1.setColor("green");
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addWheel(w1);
        c1.addWheel(w2);
        c1.addWheel(w3);
        c1.addWheel(w4);
        c1.getMirrors();


        Car c2 = new Car(e1, 20, 6, 20, "Mercedes", "M1234", "red");
        c2.addMirror(r1);
        c2.addMirror(r2);
        c2.addWheel(w1);
        c2.addWheel(w2);
        c2.addWheel(w3);
        c2.addWheel(w4);
        c2.getInfo();
        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getMirrors().get(1).getSize());
        System.out.println(c1.getWheels().get(0).getColor());
        System.out.println(c1.getWheels().get(1).getPessure());
        System.out.println("Current Fuel: " + c2.getFuelAmount());
        c2.drive();
        System.out.println("Current Fuel: " + c2.getFuelAmount());

        System.out.print("Amount of Honks: ");
        c2.honk(scanner.nextInt());


        c2.turboBoost();
        c2.doBreak();
        c2.drive();
        System.out.println("Current Fuel: " + c2.getFuelAmount());
        c2.getRemainingRangeFuel();
        c2.drive();
        System.out.println("Current Fuel: " + c2.getFuelAmount());
        c2.getRemainingRangeFuel();
    }
}
