package edu.iis.mto.multithread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BetterRadar {

    private LaunchPatriotTask task;
    private Executor executor;

    public BetterRadar(final Executor executor, LaunchPatriotTask task) {
        this.task = task;
        this.executor = executor;
    }

    public void notice(Scud enemyMissle) {
        launchPatriot();
    }

    private void launchPatriot() {
        executor.execute(task);
    }
}
