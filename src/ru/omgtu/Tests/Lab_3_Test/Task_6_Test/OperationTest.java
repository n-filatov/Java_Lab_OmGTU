package ru.omgtu.Tests.Lab_3_Test.Task_6_Test;

import junit.framework.Assert;
import org.junit.Test;
import ru.omgtu.Labs.Lab_3.Task_6.Operation;

import java.util.Stack;

/**
 * Created by Muffassa on 29.09.2015.
 */
public class OperationTest {

    @Test
    public void sumElementsNull()
    {
        Stack x = new Stack();

        x.push(0);
        x.push(0);
        x.push(0);

        int result = Operation.sum(x);
        int pattern = 0;

        Assert.assertEquals(pattern,result);
    }

    @Test
    public void sum()
    {
        Stack x = new Stack();

        x.push(2);
        x.push(3);
        x.push(4);

        int result = Operation.sum(x);
        int pattern = 9;

        Assert.assertEquals(pattern,result);
    }

    @Test
    public void pow()
    {
        Stack x = new Stack();

        x.push(2);
        x.push(3);
        x.push(4);

        int result = Operation.pow(x);
        int pattern = 24;

        Assert.assertEquals(pattern,result);
    }
}
