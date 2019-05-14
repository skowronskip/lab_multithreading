package edu.iis.mto.multithread;

public class PatriotMissileLauncher implements MissileLauncher {

    private PatriotBattery patriotBattery;

    public PatriotMissileLauncher(PatriotBattery patriotBattery) {
        this.patriotBattery = patriotBattery;
    }

    @Override
    public void launch() {
        this.patriotBattery.launchPatriot();
    }
}
