package edu.iis.mto.multithread.Executors;

import java.util.concurrent.Executor;

public class ThreadPerTaskExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).run();
    }
}
