package at.damian.projects.OO_Programming.Lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LightElement> lightElements;
    private String name;


    public Lamp() {
        this.lightElements = new ArrayList<>();
    }


    public List<LightElement> getLightElements() {
        return lightElements;
    }

    public void setLightElements(List<LightElement> lightElements) {
        this.lightElements = lightElements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLightElement(LightElement lightElement) {
        this.lightElements.add(lightElement);
        System.out.println(this.lightElements);
    }

    public void removeLightElement(LightElement lightElement) {
        this.lightElements.remove(lightElement);
        System.out.println(this.lightElements);
    }

    public void turnAllOn() {
        if (this.lightElements.getFirst().getStatus() == LightElement.STATUS.OFF) {

            for (int i = 0; i < lightElements.size(); i++) {
                this.lightElements.get(i).turnOn();
                this.lightElements.get(i).setConsumption(this.lightElements.get(i).getConsumption() + 5);


            }
            System.out.println("Turned On");
        } else {
            System.out.println("My Name is " + this.name + " and I'm already On");
        }
    }

    public void turnAllOff() {
        for (int i = 0; i < lightElements.size(); i++) {
            this.lightElements.get(i).turnOff();
        }
        System.out.println("Turned Off");
    }

    public double getOverallPowerUsage() {
        System.out.println("Getting Overall Power Usage");
        double overallPowerUsage = 0;
        for (int i = 0; i < lightElements.size(); i++) {
            System.out.println(this.lightElements.get(i).getConsumption());
            overallPowerUsage += lightElements.get(i).getConsumption();
        }
        System.out.println("Test "+overallPowerUsage);
        return overallPowerUsage;
    }

    public void printNamesOfLightElements() {
        for (int i = 0; i < lightElements.size(); i++) {
            System.out.println(this.lightElements.get(i).getName());
        }
    }



}


