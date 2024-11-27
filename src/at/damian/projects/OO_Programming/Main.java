package at.damian.projects.OO_Programming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A1234");
        c1.setFuelAmount(70);
        c1.setFuelTank(70);
        c1.setColor("green");


        Car c2 = new Car(20, 6, 20, "Mercedes", "M1234", "red");




        System.out.println(c2.getFuelAmount());
        c2.drive();
        System.out.println(c2.getFuelAmount());

        System.out.print("Amount of Honks:");
        c2.honk(scanner.nextInt());



        c2.turboBoost();
        c2.doBreak();
        c2.drive();
        c2.getRemainingRangeFuel();


    }
}
