package at.damian.projects.tests.test_02;

import java.util.ArrayList;

public class Mediamanager {
    private ArrayList<Medium> mediums = new ArrayList<>();

    public Mediamanager() {
        this.mediums = mediums;
    }

    public void addMedia(Medium media){
        this.mediums.add(media);
    }

    public void getAllMedia() {
        if (mediums == null) {
            return;
        }
        for (Medium m : mediums) {
            System.out.println(m.getTitle());
        }
    }

    public void calculateTotalMediaValue() {
        if (mediums == null) {
            return;
        }
        float value = 0;
        for (Medium m : mediums) {
            value+=m.getPrice();
        }
        System.out.println("Total Value: " +value);
    }
}
