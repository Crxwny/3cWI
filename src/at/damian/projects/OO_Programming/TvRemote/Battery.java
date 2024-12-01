package at.damian.projects.OO_Programming.TvRemote;

public class Battery {
    private int chargingStatus;


    public Battery(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public int getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(int chargingStatus) {
        if (chargingStatus > 100) {
            chargingStatus = 100;
        } else if (chargingStatus < 0) {
            chargingStatus = 0;
        } else {
            this.chargingStatus = chargingStatus;
        }
    }

}
