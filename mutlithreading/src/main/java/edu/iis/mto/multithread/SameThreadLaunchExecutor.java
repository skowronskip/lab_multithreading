package edu.iis.mto.multithread;

public class SameThreadLaunchExecutor implements MissileLaunchExecutor {

    @Override
    public void execute(Runnable command) {
        command.run();
    }
}
