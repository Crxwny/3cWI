package at.damian.projects.OO_Programming.TaskCars;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String name;
    private String origin;
    private int discount;
    private List<Car> cars;


    public Producer(String name, int discount, String origin) {
        this.name = name;
        this.discount = discount;
        this.origin = origin;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        if (discount < 0) {
            this.discount = 0;
        } else if (discount > 100) {
            this.discount = 100;
        } else {
            this.discount = discount;
        }
    }
}
