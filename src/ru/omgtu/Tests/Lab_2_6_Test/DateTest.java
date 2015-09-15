package ru.omgtu.Tests.Lab_2_6_Test;

import org.junit.Assert;
import org.junit.Test;
import ru.omgtu.Labs.Lab_2.Task_6.Date;

import static ru.omgtu.Labs.Lab_2.Task_6.Date.isLeap;

/**
 * Created by muffassa on 15.09.15.
 */
public class DateTest {

    @Test
    public void yearIsLeap()
    {
        int year = 2000;
        boolean actual = isLeap(year);
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void yearIsNotLeap()
    {
        int year = 2001;
        boolean actual = isLeap(year);
        boolean expected = false;
        Assert.assertEquals(actual,expected);
    }
}
