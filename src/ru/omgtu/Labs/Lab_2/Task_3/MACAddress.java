package ru.omgtu.Labs.Lab_2.Task_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by muffassa on 15.09.15.
 */
public class MACAddress {
    String macAddress;

    public MACAddress(String macAddress)
    {
        this.macAddress = macAddress;
    }

    public void isValid()
    {
        Pattern pattern = Pattern.compile("([a-z]+[A-Z]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        Matcher matcher = pattern.matcher(macAddress);
       
        if(matcher.matches())
        {
            System.out.println("MAC адрес валидный");
        }
        else
        {
            System.out.println("MAC адрес не валидный");
        }
    }
}
