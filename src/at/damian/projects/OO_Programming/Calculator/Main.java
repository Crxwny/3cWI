package at.damian.projects.OO_Programming.Calculator;

public class Main {

    public static void main(String[] args) {

        BasicCalculator calculator = new BasicCalculator();
        System.out.println(calculator.add(5, 2));
        System.out.println(calculator.subtract(5, 2));
        System.out.println(calculator.multiply(5, 2));
        System.out.println(calculator.divide(5, 2));

        ScienceCalculator scienceCalculator = new ScienceCalculator();
        System.out.println(scienceCalculator.sin(20));
        System.out.println(scienceCalculator.cos(20));

        RootCalculator rootCalculator = new RootCalculator();
        System.out.println(rootCalculator.sqrt(25));
    }
}
