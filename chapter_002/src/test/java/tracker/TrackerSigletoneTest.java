package tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrackerSigletoneTest {

    @Test
    public void whenTrackerSingeltone1() {
        TrackerSingletone1 ts1 = TrackerSingletone1.INSTANCE;
        TrackerSingletone1 ts2 = TrackerSingletone1.INSTANCE;
        boolean eql = false;
        if (ts1==ts2) {
            eql=true;
        }
        assertTrue(eql);

        System.out.println(ts1 + " = " + ts2);

    }

    @Test
    public void whenTrackerSingeltone2() {
        TrackerSingletone2 ts1 = TrackerSingletone2.getInstance();
        TrackerSingletone2 ts2 = TrackerSingletone2.getInstance();
        boolean eql = false;
        if (ts1 == ts2) {
            eql=true;
        }
        assertTrue(eql);

        System.out.println(ts1 + " = " + ts2);
    }

    @Test
    public void whenTrackerSingeltone3() {
        TrackerSingletone3 ts1 = TrackerSingletone3.getInstance();
        TrackerSingletone3 ts2 = TrackerSingletone3.getInstance();
        boolean eql = false;
        if (ts1 == ts2) {
            eql = true;
        }
        assertTrue(eql);

        System.out.println(ts1 + " = " + ts2);
    }

    @Test
    public void whenTrackerSingeltone4() {
        TrackerSingletone4 ts1 = TrackerSingletone4.getInstance();
        TrackerSingletone4 ts2 = TrackerSingletone4.getInstance();
        boolean eql = false;
        if (ts1 == ts2) {
            eql = true;
        }
        assertTrue(eql);

        System.out.println(ts1 + " = " + ts2);
    }

}
