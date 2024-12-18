package at.damian.projects.OO_Programming.Lamp;

public class Main {
    public static void main(String[] args) {
        LightElement lE1 = new LightElement("lE1", LightElement.STATUS.OFF, 4, "black");
        LightElement lE2 = new LightElement("lE2", LightElement.STATUS.OFF, 4, "white");
        LightElement lE3 = new LightElement("lE3", LightElement.STATUS.OFF, 3, "red");
        LightElement lE4 = new LightElement("lE4", LightElement.STATUS.OFF, 4, "green");

        Lamp l1 = new Lamp((lE1, lE2), "l1");    }
}
