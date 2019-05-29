package edu.iis.mto.multithread;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BetterRadarTest {

    PatriotBattery batteryMock;

    @Before
    public void setup() {
        batteryMock = mock(PatriotBattery.class);
    }

    @Test
    public void launchPatriotTwentyTimesWhenNoticesAScudMissle() {
        BetterRadar betterRadar = new BetterRadar(batteryMock, new ExecutorBattery(true), 20);
        betterRadar.notice(new Scud());

        verify(batteryMock, Mockito.times(20)).launchPatriot();
    }

}
