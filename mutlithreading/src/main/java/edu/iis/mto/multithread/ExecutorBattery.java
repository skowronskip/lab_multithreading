package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class ExecutorBattery implements Executor {

    private boolean isThreadTheSame;

    public ExecutorBattery(boolean isThreadTheSame) {
        this.isThreadTheSame = isThreadTheSame;
    }

    @Override
    public void execute(Runnable launchPatriotTask) {
        if (isThreadTheSame) {
            launchPatriotTask.run();
        } else {
            new Thread(launchPatriotTask).run();
        }
    }

}
