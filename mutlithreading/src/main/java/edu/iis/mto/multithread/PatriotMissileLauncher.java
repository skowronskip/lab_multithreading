package edu.iis.mto.multithread;

public class PatriotMissileLauncher implements MissileLauncher {

    private PatriotBattery patriotBattery;

    public PatriotMissileLauncher(PatriotBattery patriotBattery) {
        this.patriotBattery = patriotBattery;
    }

    @Override
    public void launch(int missilesToLaunch) {
        for (int i = 0; i < missilesToLaunch; i++) {
            this.patriotBattery.launchPatriot();
        }
    }
}
