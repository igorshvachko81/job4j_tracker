package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void maxFromTwo() {
        Max a = new Max();
        int first = 5;
        int second = 11;
        int expected = 11;
        int rsl = a.max(first, second);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void maxFromThree() {
        Max a = new Max();
        int first = 5;
        int second = 11;
        int third = 8;
        int expected = 11;
        int rsl = a.max(first, second, third);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void maxFromFour() {
        Max a = new Max();
        int first = 5;
        int second = 11;
        int third = 8;
        int fourth = 23;
        int expected = 23;
        int rsl = a.max(first, second, third, fourth);
        Assert.assertEquals(expected, rsl);
    }
}
