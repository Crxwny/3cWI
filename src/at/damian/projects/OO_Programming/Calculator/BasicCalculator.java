package at.damian.projects.OO_Programming.Calculator;

public class BasicCalculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division durch 0 ist nicht erlaubt!");
        }
        return a / b;
    }
}
