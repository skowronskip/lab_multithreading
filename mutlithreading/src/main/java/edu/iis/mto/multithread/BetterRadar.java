package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar {

    private PatriotLauncher patriotLauncher;
    private final Executor executor;

    public BetterRadar(PatriotLauncher patriotLauncher, Executor executor) {
        this.patriotLauncher = patriotLauncher;
        this.executor = executor;
    }

    public void notice(Scud enemyMissle) {
        launchPatriot();
    }

    private void launchPatriot() {
        this.executor.execute(patriotLauncher);
    }
}
