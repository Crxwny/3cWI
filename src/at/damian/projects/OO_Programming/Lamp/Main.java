package at.damian.projects.OO_Programming.Lamp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LightElement lE1 = new LightElement("lE1", LightElement.STATUS.OFF, 4, "black");
        LightElement lE2 = new LightElement("lE2", LightElement.STATUS.OFF, 4, "white");
        LightElement lE3 = new LightElement("lE3", LightElement.STATUS.OFF, 3, "red");
        LightElement lE4 = new LightElement("lE4", LightElement.STATUS.OFF, 4, "green");

        Lamp l1 = new Lamp();
        l1.addLightElement(lE4);
        l1.addLightElement(lE1);
        l1.setName("Nejo");
        l1.removeLightElement(lE4);
        l1.addLightElement(lE2);

        System.out.println(l1.getLightElements());

        l1.getOverallPowerUsage();
        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.turnAllOff();
        l1.getOverallPowerUsage();
        l1.printNamesOfLightElements();
        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.turnAllOn();
        l1.getOverallPowerUsage();



    }
}