package ru.omgtu.Labs.Lab_2.Task_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by muffassa on 15.09.15.
 */
public class Date {
    String date;

    public Date(String date)
    {
        this.date = date;
    }

    public boolean isValid()
    {

        Pattern pattern = Pattern.compile("([012][0-9]|3[01])/(0[1-9]|1[0-2])/(1[6-9]\\d{2}|[2-9]\\d{3})");
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches())
        {
            int day = Integer.parseInt(matcher.group(1));
            int month = Integer.parseInt(matcher.group(2));
            int year = Integer.parseInt(matcher.group(3));

            if(isLeap(year))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean isLeap(int year)
    {
        if((year%4 == 0) && (year % 400 == 0) && (year % 100 ==0))
        {
            return true;
        }
        else if((year % 4 == 0) && (year % 100 == 0)){
            return false;
        }
        else if (year % 4 == 0)
        {
            return true;
        }

        return false;
    }
}
