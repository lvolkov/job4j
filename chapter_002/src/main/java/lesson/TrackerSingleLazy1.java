package lesson;

import tracker.Tracker;

public class TrackerSingleLazy1 {
    private static Tracker instance;

    private TrackerSingleLazy1(Tracker tracker) {
        this.instance = tracker;
    }
    public static Tracker getInstance() {
        if (instance == null) {
            new TrackerSingleLazy1(new Tracker());
        }
        return instance;
    }
}

