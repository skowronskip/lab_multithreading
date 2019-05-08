package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BatteryExecutor implements Executor {

    private boolean isTheSameThread;

    public BatteryExecutor(boolean isTheSameThread) {
        this.isTheSameThread = isTheSameThread;
    }

    @Override
    public void execute(Runnable launchPatriotTask) {
        if (isTheSameThread) {
            launchPatriotTask.run();
        } else {
            new Thread(launchPatriotTask).run();
        }
    }
}
