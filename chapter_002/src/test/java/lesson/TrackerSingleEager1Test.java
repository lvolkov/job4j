package lesson;

import org.junit.Test;
import tracker.Tracker;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class TrackerSingleEager1Test {

    @Test
    public void whenTrackerSingleEager1() {
        TrackerSingleEager1 ts1 = TrackerSingleEager1.INSTANCE;
        TrackerSingleEager1 ts2 = TrackerSingleEager1.INSTANCE;
        assertSame(ts1,ts2);
        System.out.println(ts1 + " = " + ts2);
    }
}