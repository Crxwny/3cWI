package at.damian.projects.OO_Programming.TvRemote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries = new ArrayList<Battery>();
    private boolean isOn = false;
    private boolean hasPower;

    public Remote() {
    }

    public Remote(List<Battery> batteries, boolean isOn, boolean hasPower) {
        this.batteries = batteries;
        this.isOn = isOn;
        this.hasPower = hasPower;
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void addBatteries(Battery batteries) {
        this.batteries.add(batteries);
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isHasPower() {
        getStatus();
        if (averageCharge >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public void setHasPower(boolean hasPower) {
        this.hasPower = hasPower;
    }

    double averageCharge = 0;

    public double getStatus() {
        averageCharge = 0;
        for (int i = 0; i < batteries.size(); i++) {
            averageCharge += batteries.get(i).getChargingStatus();
        }
        averageCharge = averageCharge / batteries.size();
        return averageCharge;

    }

    public void turnOn() {
        if (isHasPower() && !isOn()) {
            System.out.println("Turning on");
            setOn(true);
            System.out.println(batteries.get(0) + " Verbraucher angeschlossen");
            System.out.println(batteries.get(1) + " Verbraucher angeschlossen");

            batteries.get(0).setChargingStatus(batteries.get(0).getChargingStatus() - 5);
            System.out.println("b1 Charge: " + batteries.get(0).getChargingStatus());
            batteries.get(1).setChargingStatus(batteries.get(1).getChargingStatus() - 5);
            System.out.println("b2 Charge: " + batteries.get(1).getChargingStatus());
        } else {
            System.out.println("Not enough charge to turn on (" + averageCharge + ") or is already on");
        }
    }

    public void turnOff() {
        if (isOn()) {
            System.out.println("Turning off");
            setOn(false);
            System.out.println(batteries.get(0) + " Verbraucher getrennt");
            System.out.println(batteries.get(1) + " Verbraucher getrennt");

            System.out.println("b1 Charge: " + batteries.get(0).getChargingStatus());
            System.out.println("b2 Charge: " + batteries.get(1).getChargingStatus());

        } else {
            System.out.println("Already off");
        }
    }
}