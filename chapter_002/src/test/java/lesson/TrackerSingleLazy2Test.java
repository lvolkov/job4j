package lesson;

import org.junit.Test;
import tracker.Tracker;

import static org.junit.Assert.assertTrue;

public class TrackerSingleLazy2Test {

    @Test
    public void whenTrackerSingleLazy2() {
        Tracker ts1 = TrackerSingleLazy2.getInstance();
        Tracker ts2 = TrackerSingleLazy2.getInstance();
        boolean eql = false;
        if (ts1 == ts2) {
            eql = true;
        }
        assertTrue(eql);
        System.out.println(ts1 + " = " + ts2);
    }
}