package edu.iis.mto.multithread;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BetterRadarTest {

    @Test
    public void launchPatriotOnceWhenNoticesAScudMissle() {
        int patriotAmount = 10;
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        BetterRadar betterRadar = new BetterRadar(batteryMock, Runnable::run);
        betterRadar.notice(new Scud());
        verify(batteryMock, times(patriotAmount)).launchPatriot();
    }

}
