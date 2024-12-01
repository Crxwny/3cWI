package at.damian.projects.OO_Programming.TaskCars;

public class Car {
    private String color;
    private int maxSpeed;
    private int basePrice;
    private double baseConsumption;
    private Engine engine;
    private Producer producer;
    private int drivenKilometers;

    public Car(String color, int maxSpeed, int basePrice, int baseConsumption, Engine engine, Producer producer) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.engine = engine;
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(double baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDrivenKilometers() {
        return drivenKilometers;
    }

    public void setDrivenKilometers(int drivenKilometers) {
        this.drivenKilometers = drivenKilometers;
    }

    public double Price() {
        return this.basePrice - (double) (this.basePrice * getProducer().getDiscount()) / 100;
    }

    private double Consumption() {
        if (drivenKilometers > 50000) {
            return (getBaseConsumption() *  0.98);
        } else {
            return getBaseConsumption();
        }
    }


}
