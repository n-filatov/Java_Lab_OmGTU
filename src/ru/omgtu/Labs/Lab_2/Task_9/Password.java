package ru.omgtu.Labs.Lab_2.Task_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by muffassa on 16.09.15.
 */
public class Password {
    String password;

    public Password(String password)
    {
        this.password = password;
    }

    public boolean isValid()
    {
        Pattern pattern = Pattern.compile("([A-Z]+|[\\w]+|[\\d]+|[_]){8,}");
        Matcher matcher = pattern.matcher(password);
        Pattern patternUpperCase = Pattern.compile("[A-Z]+");
        Pattern patternLowerCase = Pattern.compile("[a-z]+");
        Pattern patternNumber = Pattern.compile("\\d+");
        Matcher matcherUpperCase = patternUpperCase.matcher(password);
        Matcher matcherLowerCase = patternLowerCase.matcher(password);
        Matcher matcherNumber = patternNumber.matcher(password);

        /*boolean b1 = matcher.matches();
        boolean b2 = matcherNumber.find();
        boolean b3 = matcherUpperCase.find();
        boolean b4 = matcherLowerCase.find();*/

        if(matcherNumber.find() && matcher.matches() && matcherUpperCase.find() && matcherLowerCase.find())
        {
            return true;
        }
        else return false;
    }
}
