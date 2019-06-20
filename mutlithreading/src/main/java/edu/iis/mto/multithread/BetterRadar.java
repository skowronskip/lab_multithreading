package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar {
	private PatriotBattery battery;
	private Executor executor;
	private int patriotAmount = 10;

	public BetterRadar(PatriotBattery battery, Executor executor) {
		this.battery = battery;
		this.executor = executor;
	}

	public void notice(Scud enemyMissle) {
		launchPatriot();
	}

	private void launchPatriot() {
		executor.execute(() -> {
			for (int i = 0; i < patriotAmount; i++) {
				battery.launchPatriot();
			}
		});
	}
}
