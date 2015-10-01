package ru.omgtu.Tests.Lab_3_Test.Task_9_Test;

import org.junit.Assert;
import org.junit.Test;
import ru.omgtu.Labs.Lab_3.Task_9.Simbol;

/**
 * Created by Muffassa on 30.09.2015.
 */
public class SimbolTest {
    @Test
    public void stringIsEmpty()
    {
        String[] string = new String[]{""};
        String[] actual = new String[string.length];
        String[] pattern = new String[0];

        actual = Simbol.revers(string);

        Assert.assertArrayEquals(pattern, actual);
    }

    @Test
    public void stringInOneSimbol()
    {
        String[] string = new String[]{"a"};
        String[] actual = new String[string.length];
        String[] pattern = new String[]{"a"};

        actual = Simbol.revers(string);

        Assert.assertArrayEquals(pattern, actual);
    }

    @Test
    public void stringInNumbers()
    {
        String[] string = new String[]{"1","2","3"};
        String[] actual = new String[string.length];
        String[] pattern = new String[]{"3","2","1"};

        actual = Simbol.revers(string);

        Assert.assertArrayEquals(pattern, actual);
    }

    @Test
    public void stringInSimbols()
    {
        String[] string = new String[]{";","!",","};
        String[] actual = new String[string.length];
        String[] pattern = new String[]{",","!",";"};

        actual = Simbol.revers(string);

        Assert.assertArrayEquals(pattern, actual);
    }


}
