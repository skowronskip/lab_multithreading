package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar {
	private LaunchPatriot launchPatriot;
	private Executor executor;

	public BetterRadar(LaunchPatriot launchPatriot, Executor executor) {
		this.launchPatriot = launchPatriot;
		this.executor = executor;
	}

	public void notice(Scud enemyMissle) {
		launchPatriot();
	}

	private void launchPatriot() {
		executor.execute(() -> launchPatriot.launchPatriot());
	}
}
