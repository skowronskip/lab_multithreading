package edu.iis.mto.multithread;


import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class BetterRadarTest {

    @Test
    @RepeatedTest(50)
    public void launchPatriotOnceWhenNoticesAScudMissle() {
        int patriotAmount = 10;
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        LaunchPatriot launchPatriot = new BasicLaunchPatrtiot(batteryMock, patriotAmount);
        BetterRadar betterRadar = new BetterRadar(launchPatriot, Runnable::run);
        betterRadar.notice(new Scud());
        verify(batteryMock, times(patriotAmount)).launchPatriot();
    }

}
