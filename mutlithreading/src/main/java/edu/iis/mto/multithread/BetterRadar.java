package edu.iis.mto.multithread;

public class BetterRadar implements Notifiable {

    private PatriotBattery battery;
    private final int missileCount;
    private MissileLaunchExecutor executor;

    public BetterRadar(PatriotBattery battery, int missileCount, MissileLaunchExecutor executor) {
        this.battery = battery;
        this.missileCount = missileCount;
        this.executor = executor;
    }

    @Override
    public void notice(Scud enemyMissile) {
        executor.execute(() -> {
            for (int i = 0; i < missileCount; i++) {
                battery.launchPatriot();
            }
        });
    }
}
