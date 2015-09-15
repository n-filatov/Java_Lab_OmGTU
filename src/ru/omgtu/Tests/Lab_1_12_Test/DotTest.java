package ru.omgtu.Tests.Lab_1_12_Test;

import org.junit.Assert;
import org.junit.Test;
import ru.omgtu.Labs.lab_1_12.Dot;

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
}
