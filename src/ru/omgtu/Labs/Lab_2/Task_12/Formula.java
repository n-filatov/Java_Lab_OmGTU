package ru.omgtu.Labs.Lab_2.Task_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by muffassa on 16.09.15.
 */
public class Formula {
    String formula;

    public Formula(String formula)
    {
        this.formula = formula;
    }

    public boolean isValid()
    {
        Pattern pattern = Pattern.compile("(\\d+ \\+)+");
        Matcher matcher = pattern.matcher(formula);
        return matcher.find();

    }
}
