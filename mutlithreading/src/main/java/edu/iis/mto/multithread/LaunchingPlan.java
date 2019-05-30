package edu.iis.mto.multithread;

public class LaunchingPlan implements Runnable {

    private PatriotBattery patriotBattery;
    private int numberOfRockets;

    public LaunchingPlan(PatriotBattery patriotBattery, int numberOfRockets){
        this.patriotBattery = patriotBattery;
        this.numberOfRockets = numberOfRockets;
    }

    @Override
    public void run() {
        for(int i = 0; i< numberOfRockets;i++) {
            patriotBattery.launchPatriot();
        }
    }
}
