package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar {

    private PatriotBattery patriotBattery;
    private Executor executor;
    private int rocketsAmount;

    public BetterRadar(PatriotBattery patriotBattery, Executor executor, int rocketsAmount) {
        this.patriotBattery = patriotBattery;
        this.executor = executor;
        this.rocketsAmount = rocketsAmount;
    }

    public void notice(Scud enemyMissle) {
        //TODO add implementation
    }

}
