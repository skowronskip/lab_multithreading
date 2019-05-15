package edu.iis.mto.multithread;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BetterRadarTest {

    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @Test
    @RepeatRule.Repeat(times = 10000)
    public void launchPatriotOnceWhenNoticesAScudMissle() throws InterruptedException {
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        BetterRadar radar = new BetterRadar(1, new PatriotMissileLauncher(batteryMock), new CurrentThreadExecutor());
        radar.notice(new Scud());
        verify(batteryMock, times(1)).launchPatriot();
    }
}
