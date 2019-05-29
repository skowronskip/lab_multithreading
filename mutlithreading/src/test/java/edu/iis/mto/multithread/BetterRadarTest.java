package edu.iis.mto.multithread;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BetterRadarTest {

    PatriotBattery batteryMock;

    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @Before
    public void setup() {
        batteryMock = mock(PatriotBattery.class);
    }

    @Test
    @RepeatRule.Repeat(times = 100)
    public void launchPatriotTwentyTimesWhenNoticesAScudMissle() {
        BetterRadar betterRadar = new BetterRadar(batteryMock, new ExecutorBattery(true), 5);
        betterRadar.notice(new Scud());

        verify(batteryMock, Mockito.times(5)).launchPatriot();
    }

}
