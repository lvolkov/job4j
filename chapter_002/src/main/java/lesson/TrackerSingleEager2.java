package lesson;

import tracker.Tracker;

public class TrackerSingleEager2 {
    private TrackerSingleEager2() {
    }

    public static final Tracker TRACKER = new Tracker();

    public static Tracker getTracker() {
        return TRACKER;
    }
}