package at.damian.projects.OO_Programming.TvRemote;

public class Main {
    public static void main(String[] args) {

        Battery b1 = new Battery(10);
        Battery b2 = new Battery(15);
        Remote r1 = new Remote();;
        r1.addBatteries(b1);
        r1.addBatteries(b2);
        System.out.println("Amount of Batteries in the remote: "+r1.getBatteries().size());
        System.out.println("Battery Status: "+r1.getStatus());
        System.out.println("is On: "+r1.isOn());
        System.out.println("has Power: "+r1.isHasPower());
        r1.turnOn();
        System.out.println("is On: "+r1.isOn());
        System.out.println("Battery Status: "+r1.getStatus());
        r1.turnOn();
        System.out.println("is On: "+r1.isOn());
        System.out.println("Battery Status: "+r1.getStatus());
        r1.turnOff();
        r1.turnOff();
        System.out.println("is On: "+r1.isOn());
        System.out.println("has Power: "+r1.isHasPower());
        r1.turnOn();
        System.out.println("is On: "+r1.isOn());
        System.out.println("has Power: "+r1.isHasPower());

    }


}
