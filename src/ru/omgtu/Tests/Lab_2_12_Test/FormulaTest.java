package ru.omgtu.Tests.Lab_2_12_Test;

import org.junit.Assert;
import org.junit.Test;
import ru.omgtu.Labs.Lab_2.Task_12.Formula;


/**
 * Created by muffassa on 16.09.15.
 */
public class FormulaTest {

    @Test
    public void formulaIsNull()
    {
        Formula formula = new Formula("");
        boolean expected = false;
        boolean actual = formula.isValid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void formulaIsSpace()
    {
        Formula formula = new Formula(" ");
        boolean expected = false;
        boolean actual = formula.isValid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void formulaIsValid()
    {
        Formula formula = new Formula("3 + 4 - 11");
        boolean expected = true;
        boolean actual = formula.isValid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void formulaIsNotValid()
    {
        Formula formula = new Formula("3 * 4 - 11");
        boolean expected = false;
        boolean actual = formula.isValid();
        Assert.assertEquals(expected, actual);
    }
}
