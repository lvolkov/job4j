package lesson;

import tracker.Tracker;

public enum  TrackerSingleEager1 {
    INSTANCE(new Tracker());
    final Tracker tracker;

     TrackerSingleEager1(Tracker tracker) {
        this.tracker = tracker;
    }
}