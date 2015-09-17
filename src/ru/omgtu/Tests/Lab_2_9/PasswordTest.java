package ru.omgtu.Tests.Lab_2_9;

import org.junit.Assert;
import org.junit.Test;
import ru.omgtu.Labs.Lab_2.Task_3.MACAddress;
import ru.omgtu.Labs.Lab_2.Task_9.Password;

/**
 * Created by muffassa on 16.09.15.
 */
public class PasswordTest {

    @Test
    public void stringIsNull()
    {
        Password password = new Password("");
        boolean expected = false;
        boolean actual = password.isValid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numbersPassword()
    {
        Password password = new Password("77777777");
        boolean expected = false;
        boolean actual = password.isValid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lowerCasePassword()
    {
        Password password = new Password("asdfasdf");
        boolean expected = false;
        boolean actual = password.isValid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void upperCasePassword()
    {
        Password password = new Password("ASDFQWER");
        boolean expected = false;
        boolean actual = password.isValid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void passwordIsLessThen8()
    {
        Password password = new Password("As3");
        boolean expected = false;
        boolean actual = password.isValid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void validPassword()
    {
        Password password = new Password("Supper_Pas1");
        boolean expected = true;
        boolean actual = password.isValid();
        Assert.assertEquals(expected, actual);
    }

}
