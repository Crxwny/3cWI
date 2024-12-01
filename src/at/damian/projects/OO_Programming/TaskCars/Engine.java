package at.damian.projects.OO_Programming.TaskCars;

public class Engine {
    private enum TYPE {Diesel, Gas};
    private TYPE type;
    private int horsePower;
    private Engine engine;


    public Engine(TYPE type, int horsePower, Engine engine) {
        this.type = type;
        this.horsePower = horsePower;
        this.engine = engine;
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
}
