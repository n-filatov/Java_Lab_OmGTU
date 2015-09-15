package ru.omgtu.Tests.Lab_2_3_Test;

import org.junit.Assert;
import org.junit.Test;
import ru.omgtu.Labs.Lab_2.Task_3.MACAddress;

/**
 * Created by muffassa on 15.09.15.
 */
public class MACAddressTest {

    @Test
    public void macIsValid()
    {
        MACAddress validMAC = new MACAddress("bE:dC:cA:56:76:54");
        boolean expected = true;
        boolean actual = validMAC.isValid();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void macIsNotValid()
    {
        MACAddress mac = new MACAddress("01:23:45:67:89:Az");
        boolean expected = true;
        boolean actual = mac.isValid();
        Assert.assertEquals(expected,actual);
    }
}
