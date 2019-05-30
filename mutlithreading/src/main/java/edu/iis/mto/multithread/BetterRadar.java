package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar {

    private Executor executor;
    private int missilesToLaunch;
    private MissileLauncher missileLauncher;

    public BetterRadar(int missilesToLaunch, MissileLauncher missileLauncher, Executor executor) {
        this.executor = executor;
        this.missilesToLaunch = missilesToLaunch;
        this.missileLauncher = missileLauncher;
    }

    public void notice(Scud enemyMissle) {
        launchPatriot();
    }

    private void launchPatriot() {
        this.executor.execute(() -> {
            this.missileLauncher.launch(missilesToLaunch);
        });
    }
}
