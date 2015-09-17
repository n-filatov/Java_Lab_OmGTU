package ru.omgtu.Labs.Lab_2.Task_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Проверить существуют ли в тексте цифры, за которыми не стоит «+».
        – пример правильных выражений: (3 + 5) – 9 × 4.
        – пример неправильных выражений: 2 * 9 – 6 × 5.*/
public class Main {
    public static void main(String[] args)
    {
        Formula formula = new Formula("(3 + 5) – 9 × 4");


        if(formula.isValid())
        {
            System.out.println("Выражение соответствует шаблону");
        }
        else
        {
            System.out.println("Выражение не соответствует шаблону");

        }
    }
}
