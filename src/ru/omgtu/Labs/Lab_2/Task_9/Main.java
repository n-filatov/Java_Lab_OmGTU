package ru.omgtu.Labs.Lab_2.Task_9;

import java.util.regex.Pattern;

/**
 * Created by muffassa on 16.09.15.
 */
public class Main {
    public static void main(String[] args)
    {
        Password password = new Password("SupperPas1");

        if(password.isValid())
        {
            System.out.println("Пароль валидный");
        }
        else
        {
            System.out.println("Пароль не валидный");
        }
    }
}
