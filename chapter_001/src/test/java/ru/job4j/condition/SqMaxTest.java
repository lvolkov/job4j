package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SqMaxTest {
    @Test
    public void  whenFirstMax() {
        SqMax test=new SqMax();
        int result = test.max(5,2,3,4);
        assertThat(result,is(5));
    }
    @Test
    public void  whenSecondMax() {
        SqMax test=new SqMax();
        int result = test.max(5,6,3,4);
        assertThat(result,is(6));
    }
    @Test
    public void  whenThirdMax() {
        SqMax test=new SqMax();
        int result = test.max(5,2,7,4);
        assertThat(result,is(7));
    }
    @Test
    public void  whenForthMax() {
        SqMax test=new SqMax();
        int result = test.max(5,2,3,8);
        assertThat(result,is(8));
    }
}
