package ru.omgtu.Tests.Lab_1_Test.Lab_1_12_Test;

import org.junit.Assert;
import org.junit.Test;
import ru.omgtu.Labs.Lab_1.Task_12.Dot;

/**
 * Created by muffassa on 15.09.15.
 */
public class DotTest {

    @Test
    public void distanceIsNull()
    {
        Dot dot = new Dot(4,5,11);
        Dot dot2 = new Dot(4,5,11);
        double actual = dot.distanceTo(dot2);
        double pattern = 0.0;
        Assert.assertEquals(pattern, actual, 1);

    }

    @Test
    public  void distanceToPassiveCoordinateDot()
    {
        Dot dot = new Dot(4,5,11);
        Dot dot2 = new Dot(2,-31,2);
        double actual = dot.distanceTo(dot2);
        double pattern = 37.16;
        Assert.assertEquals(actual,pattern,2);
    }

    @Test
    public  void allCoordinateIsNull()
    {
        Dot dot = new Dot(0,0,0);
        Dot dot2 = new Dot(2,-31,2);
        double actual = dot.distanceTo(dot2);
        double pattern = 31.12;
        Assert.assertEquals(actual,pattern,2);
    }
}
