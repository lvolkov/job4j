package lesson;

import org.junit.Test;
import tracker.Tracker;
import static org.junit.Assert.assertTrue;

public class TrackerSingleEager2Test {

    @Test
    public void whenTrackerSingleEager2() {
        Tracker ts1 = TrackerSingleEager2.getTracker();
        Tracker ts2 = TrackerSingleEager2.getTracker();
        boolean eql = false;
        if (ts1 == ts2) {
            eql = true;
        }
        assertTrue(eql);
        System.out.println(ts1 + " = " + ts2);
    }
}