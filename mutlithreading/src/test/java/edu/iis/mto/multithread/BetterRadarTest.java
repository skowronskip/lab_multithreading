package edu.iis.mto.multithread;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

import org.junit.jupiter.api.RepeatedTest;

public class BetterRadarTest {

    @RepeatedTest(100)
    public void noticeShouldLaunchPatriotWhenPresentedWithScudMissile() {
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        int missileCount = 7;
        BetterRadar betterRadar = new BetterRadar(batteryMock, missileCount, new SameThreadLaunchExecutor());

        betterRadar.notice(new Scud());

        verify(batteryMock, times(missileCount)).launchPatriot();
    }
}
