package edu.iis.mto.multithread;

public class PatriotLauncher implements Runnable {

    private final int missilesCount;
    private PatriotBattery battery;

    public PatriotLauncher(PatriotBattery patriotBattery, int missilesCount) {
        this.battery = patriotBattery;
        this.missilesCount = missilesCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.missilesCount; i++) {
            battery.launchPatriot();
        }
    }
}
