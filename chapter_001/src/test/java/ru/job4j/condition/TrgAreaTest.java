package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrgAreaTest {
    @Test
    public void whenExist() {
        boolean result = TrgArea.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenNoExist() {
        boolean result = TrgArea.exist(2.0, 2.0, 4.0);
        assertThat(result, is(false));
    }
    @Test
    public void whenAreaTrue() {
        Point first = new Point(0,0);
        Point second = new Point (0,3);
        Point third = new Point (2,0);
        TrgArea trg = new TrgArea(first,second,third);
        double result = trg.area();
       // int result2 =(int)result;
       // assertThat(result2, is(3),0.01);
        Assert.assertEquals(3, result, 0.01);
    }
}