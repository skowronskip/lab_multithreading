package edu.iis.mto.multithread;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BetterRadarTest {

    @Test
    public void launchPatriotOnceWhenNoticesAScudMissle() {
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        BetterRadar betterRadar = new BetterRadar(batteryMock, new BatteryExecutor(true), 10);
        betterRadar.notice(new Scud());
        verify(batteryMock, times(10)).launchPatriot();
    }
}
