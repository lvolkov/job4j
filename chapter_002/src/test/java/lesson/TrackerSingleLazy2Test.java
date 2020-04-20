package lesson;

import org.junit.Test;
import tracker.Tracker;

import static org.junit.Assert.assertSame;

public class TrackerSingleLazy2Test {

    @Test
    public void whenTrackerSingleLazy2() {
        Tracker ts1 = TrackerSingleLazy2.getInstance();
        Tracker ts2 = TrackerSingleLazy2.getInstance();
        assertSame(ts1,ts2);
        System.out.println(ts1 + " = " + ts2);
    }
}