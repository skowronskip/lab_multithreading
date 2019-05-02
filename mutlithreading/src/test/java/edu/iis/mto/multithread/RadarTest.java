package edu.iis.mto.multithread;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RadarTest {

    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @Test
    @RepeatRule.Repeat(times = 10 )
    public void launchPatriotOnceWhenNoticesAScudMissle() {

        Executor executor = command -> command.run();
        PatriotBattery batteryMock = mock(PatriotBattery.class);
        LaunchPatriotTask task = new LaunchPatriotTask(batteryMock, 1);

        BetterRadar radar = new BetterRadar(executor, task);
        radar.notice(new Scud());
        verify(batteryMock).launchPatriot();
    }

}
