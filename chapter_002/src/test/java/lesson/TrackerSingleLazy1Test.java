package lesson;

import org.junit.Test;
import tracker.Tracker;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class TrackerSingleLazy1Test {

    @Test
    public void whenTrackerSingleLazy1() {
        Tracker ts1 = TrackerSingleLazy1.getInstance();
        Tracker ts2 = TrackerSingleLazy1.getInstance();
        assertSame(ts1,ts2);
        System.out.println(ts1 + " = " + ts2);
    }
}