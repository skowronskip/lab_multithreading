package edu.iis.mto.multithread;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BetterRadarTest {

    @Test
    public void launchPatriotOnceWhenNoticesAScudMissle() {
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        BetterRadar radar = new BetterRadar(new PatriotLauncher(batteryMock, 1), new CurrentThreadExecutor());
        radar.notice(new Scud());
        verify(batteryMock).launchPatriot();
    }
}
