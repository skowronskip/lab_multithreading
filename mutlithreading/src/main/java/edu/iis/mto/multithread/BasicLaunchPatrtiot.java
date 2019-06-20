package edu.iis.mto.multithread;

public class BasicLaunchPatrtiot implements LaunchPatriot {
  private PatriotBattery battery;
  private int patriotAmount;

  public BasicLaunchPatrtiot(PatriotBattery battery, int patriotAmount) {
    this.battery = battery;
    this.patriotAmount = patriotAmount;
  }

  public void launchPatriot() {
    for (int i = 0; i < patriotAmount; i++) {
      battery.launchPatriot();
    }
  }
}
