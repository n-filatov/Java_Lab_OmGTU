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

    public boolean isValid()
    {
        Pattern pattern = Pattern.compile("([a-z]+[A-Z]+:){3}+(\\d{2}+:){2}+\\d{2}");
        Matcher matcher = pattern.matcher(macAddress);
        return matcher.matches();
       

    }
}
