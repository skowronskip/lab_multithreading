package edu.iis.mto.multithread;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.junit.Test;

public class BetterRadarTest {
	
	@Test
	public void launchPatriotSpecificAmountOfTimesWhenNoticesEnemyMissle() {
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        BetterRadar betterRadar = new BetterRadar(batteryMock, 10, new ThreadExecutor(ExecutorType.SAME_THREAD));
        betterRadar.notice(new Scud());
        verify(batteryMock, times(10)).launchPatriot();
	}
}
