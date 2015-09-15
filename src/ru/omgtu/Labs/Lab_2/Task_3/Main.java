package ru.omgtu.Labs.Lab_2.Task_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Написать регулярное выражение, определяющее является ли заданная строка правильным MAC-адресом.
– пример правильных выражений: aE:dC:cA:56:76:54.
– пример неправильных выражений: 01:23:45:67:89:Az.*/
public class Main {
    public static void main(String[] args) {

        MACAddress validMAC = new MACAddress("bE:dC:cA:56:76:54");
        MACAddress nonValidMac = new MACAddress("01:23:45:67:89:Az");
        validMAC.isValid();
        nonValidMac.isValid();


    }
}
