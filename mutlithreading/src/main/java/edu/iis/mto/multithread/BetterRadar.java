package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar implements Runnable {
	private PatriotBattery patriotBattery;
	private int rocketsCount;
	private Executor executor;
	
	public BetterRadar(PatriotBattery patriotBattery, int rocketsCount, Executor executor) {
		this.patriotBattery = patriotBattery;
		this.rocketsCount = rocketsCount;
		this.executor = executor;
	}
	
	public void notice(Scud enemyMissle) {
		launchPatriot();
	}

	private void launchPatriot() {
		executor.execute(this);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < rocketsCount; i++) {
			patriotBattery.launchPatriot();
		}
		
	}
	
}
