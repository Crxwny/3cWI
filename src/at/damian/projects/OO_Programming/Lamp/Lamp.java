package at.damian.projects.OO_Programming.Lamp;

import java.util.List;

public class Lamp {
    private List<LightElement> lightElements;
    private String name;

    public Lamp(List<LightElement> lightElements, String name) {
        this.lightElements = lightElements;
        this.name = name;
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
        for (int i = 0; i < lightElements.size(); i++) {
            this.lightElements.get(i).turnOn();
        }
    }

    public void turnAllOff() {
        for (int i = 0; i < lightElements.size(); i++) {
            this.lightElements.get(i).turnOff();
        }
    }

    public double getOverallPowerUsage() {
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


