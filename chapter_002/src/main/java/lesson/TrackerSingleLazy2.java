package lesson;

import tracker.Tracker;

public class TrackerSingleLazy2 {
    private TrackerSingleLazy2() {
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }
}