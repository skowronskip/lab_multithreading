package edu.iis.mto.multithread;


	private PatriotBattery battery;

	public Radar(PatriotBattery battery) {
		this.battery = battery;
	}

    @Override
    public void notice(Scud enemyMissile) {
		launchPatriot();
	}

	private void launchPatriot() {
		Runnable launchPatriotTask = new Runnable() {

			public void run() {
				for (int i = 0; i < 10; i++) {
					battery.launchPatriot();
				}
			}
		};

		Thread launchingThread = new Thread(launchPatriotTask);
		launchingThread.start();
	}
}
