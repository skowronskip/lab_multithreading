package edu.iis.mto.multithread;

public class LaunchPatriotTask implements Runnable {

    private int number_of_rockets;
    private PatriotBattery battery;

    public LaunchPatriotTask(PatriotBattery battery, int number_of_rockets) {
        this.number_of_rockets = number_of_rockets;
        this.battery = battery;
    }

    @Override
    public void run() {
        for (int i = 0; i < number_of_rockets; i++) {
            battery.launchPatriot();
        }
    }
}
