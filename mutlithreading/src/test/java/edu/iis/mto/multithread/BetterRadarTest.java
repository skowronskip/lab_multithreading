package edu.iis.mto.multithread;

import edu.iis.mto.multithread.Executors.DirectExecutor;
import org.junit.Rule;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BetterRadarTest {

    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @Test
    @Repeat( times = 10 )
    public void Test_Are_Rockets_Launched_In_The_Same_Thread() {
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        BetterRadar radar = new BetterRadar(new LaunchingPlan(batteryMock, 1), new DirectExecutor());
        radar.notice(new Scud());
        verify(batteryMock).launchPatriot();
    }
}

