package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar {
    private PatriotBattery battery;
    private LaunchingPlan launchingPlan;
    private Executor executor;

    public BetterRadar(LaunchingPlan launchingPlan, Executor executor)
    {
        this.battery = battery;
        this.launchingPlan = launchingPlan;
        this.executor = executor;
    }

    public void notice(Scud enemyMissle)
    {
        launchPatriot();
    }

    private void launchPatriot() {
        executor.execute(launchingPlan);
    }
}
