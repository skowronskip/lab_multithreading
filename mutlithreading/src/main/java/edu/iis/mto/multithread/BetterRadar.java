package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar implements Runnable{

    private PatriotBattery battery;
    private Executor executor;
    private int rocketsToLaunch;

    public BetterRadar(PatriotBattery battery, Executor executor, int rocketsToLaunch) {
        this.battery = battery;
        this.executor = executor;
        this.rocketsToLaunch = rocketsToLaunch;
    }

    public void notice(Scud enemyMissle) {
        launchPatriot();
    }

    private void launchPatriot() {
        executor.execute(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < rocketsToLaunch; i++) {
            battery.launchPatriot();
        }
    }
}
