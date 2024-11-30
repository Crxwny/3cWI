package at.damian.projects.OO_Programming.Car;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type; //Diesel oder Benzin
    private int speed;

    public Engine() {
    }

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    // amount between 0 and 100
    public void drive(int amount) {
        System.out.println("the motor is running with " + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower > 100) {
            this.horsePower = 100;
        } else if (horsePower <= 0) {
            this.horsePower = 1;
        } else {
            this.horsePower = horsePower;
        }
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 100) {
            this.speed = 100;
        } else if (speed <= 0) {
            this.speed = 1;
        } else {
            this.speed = speed;
        }
    }
}
