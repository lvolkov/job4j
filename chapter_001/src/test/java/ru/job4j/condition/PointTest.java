package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void distance3d() {
        Point first = new Point (0,0,0);
        Point second = new Point (2,2,2);
        double result = first.distance3d(second);
        assertThat(result, is(3.4641016151377544));
    }
}
