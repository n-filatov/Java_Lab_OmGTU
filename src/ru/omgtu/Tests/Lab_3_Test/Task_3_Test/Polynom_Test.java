package ru.omgtu.Tests.Lab_3_Test.Task_3_Test;

import junit.framework.Assert;
import org.junit.Test;
import ru.omgtu.Labs.Lab_3.Task_3.Polynom;

import java.util.HashMap;

/**
 * Created by Muffassa on 29.09.2015.
 */
public class Polynom_Test {

    @Test
    public void allArgumentsIsNull()
    {
        HashMap<Integer, Integer> x =  new HashMap<Integer,Integer>();
        HashMap<Integer, Integer> y =  new HashMap<Integer,Integer>();
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();

        x.put(0,0);
        x.put(1,0);
        x.put(2,0);

        y.put(0,0);
        y.put(1,0);
        y.put(2,0);

        result = Polynom.sum(x,y);
        int actual = result.get(0);

        Assert.assertEquals(actual, 0);
    }

    @Test
    public void allArgumentsIsPassive()
    {
        HashMap<Integer, Integer> x =  new HashMap<Integer,Integer>();
        HashMap<Integer, Integer> y =  new HashMap<Integer,Integer>();
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();

        x.put(0,-4);
        x.put(1,-8);
        x.put(2,-3);

        y.put(0,-11);
        y.put(1,-21);
        y.put(2,-31);

        result = Polynom.sum(x,y);
        Integer pattern[] = {-15,-29,-34};

        for (int i = 0; i < pattern.length; i++) {
            Assert.assertEquals(pattern[i], result.get(i));
        }



    }
}
