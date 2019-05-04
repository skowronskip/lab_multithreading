package edu.iis.mto.multithread;

public class NewThreadLaunchExecutor implements MissileLaunchExecutor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).run();
    }
}
