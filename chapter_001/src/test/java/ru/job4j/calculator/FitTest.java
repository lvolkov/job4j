package ru.job4j.calculator;

 import org.junit.Assert;
 import org.junit.Test;

 public class FitTest {
     @Test
     public void womanWeight() {
         double in = 170;
         double expected = 69;
         double out = Fit.womanWeight(in);
         Assert.assertEquals(expected, out, 0.01);
     }

     @Test
     public void manWeight() {
         double in = 176;
         double expected = 87.40;
         double out = Fit.manWeight(in);
         Assert.assertEquals(expected, out, 0.01);

     }
 }