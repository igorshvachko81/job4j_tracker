package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point p1 = new Point(0, 7);
        Point p2 = new Point(7, 7);
        double expected = 7.0;
        double result;
        result = p1.distance(p2);
        Assert.assertEquals(expected, result, 0.001);
    }

    @Test
    public void distanceZero() {
        Point p1 = new Point(0, 7);
        Point p2 = new Point(0, 7);
        double expected = 0.0;
        double result;
        result = p1.distance(p2);
        Assert.assertEquals(expected, result, 0.001);
    }

    @Test
    public void distanceDiffSquare() {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-3, -4);
        double expected = 10.0;
        double result;
        result = p1.distance(p2);
        Assert.assertEquals(expected, result, 0.001);
    }

    @Test
    public void distanceWrongCalculate() {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-3, -4);
        double expected = 11.0;
        double result;
        result = p1.distance(p2);
        Assert.assertNotEquals(expected, result, 0.001);
    }

}
