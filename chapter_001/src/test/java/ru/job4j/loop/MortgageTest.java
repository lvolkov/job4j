package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 1200, 25);
        assertThat(year, is(2));
    }

    @Test
    public void when3Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(150, 120, 50);
        assertThat(year, is(3));
    }

    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 1200, 10);
        assertThat(year, is(1));
    }

}