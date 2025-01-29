package at.damian.projects.OO_Programming.Calculator;

public class RootCalculator extends BasicCalculator{
    public double sqrt(double x) {
        if (x < 0) {
            System.out.println("Wurzel aus einer negativen Zahl ist nicht erlaubt!");
        }
        return Math.sqrt(x);
    }
}
