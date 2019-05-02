package edu.iis.mto.multithread;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.Executor;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RadarTest {

    @Rule
    public RepeatRule repeatRule = new RepeatRule();
    private Executor executor;
    private PatriotBattery batteryMock;

    @Before
    public void setup() {
        executor = command -> command.run();
        batteryMock = mock(PatriotBattery.class);
    }

    @Test
    @RepeatRule.Repeat(times = 10)
    public void launchPatriotOnceWhenNoticesAScudMissle() {

        LaunchPatriotTask task = new LaunchPatriotTask(batteryMock, 1);
        BetterRadar radar = new BetterRadar(executor, task);
        radar.notice(new Scud());
        verify(batteryMock).launchPatriot();
    }

    @Test
    @RepeatRule.Repeat(times = 10)
    public void launchPatriotTwiceWhenNoticesAScudMissle() {

        LaunchPatriotTask task = new LaunchPatriotTask(batteryMock, 2);
        BetterRadar radar = new BetterRadar(executor, task);
        radar.notice(new Scud());
        verify(batteryMock, times(2)).launchPatriot();
    }
    

}
