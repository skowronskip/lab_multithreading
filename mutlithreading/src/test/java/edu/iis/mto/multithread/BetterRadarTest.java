package edu.iis.mto.multithread;

import org.junit.Rule;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BetterRadarTest {

    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @Test
    @RepeatRule.Repeat(times = 10)
    public void launchPatriotOnceWhenNoticesAScudMissle() {
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        BetterRadar betterRadar = new BetterRadar(batteryMock, new BatteryExecutor(true), 10);
        betterRadar.notice(new Scud());
        verify(batteryMock, times(10)).launchPatriot();
    }
}
