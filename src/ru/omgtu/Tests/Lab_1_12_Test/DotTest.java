package ru.omgtu.Tests.Lab_1_12_Test;

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
        double actual = dot.distanceTo(4,5,11);
        double pattern = 0.0;
        Assert.assertEquals(pattern, actual, 1);

    }

    @Test
    public  void distanceToPassiveCoordinateDot()
    {
        Dot dot = new Dot(4,5,11);
        double actual = dot.distanceTo(2,-31,2);
        double pattern = 37.16;
        Assert.assertEquals(actual,pattern,2);
    }
}
