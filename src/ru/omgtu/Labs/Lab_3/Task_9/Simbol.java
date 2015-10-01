package ru.omgtu.Labs.Lab_3.Task_9;

import java.util.Stack;

/**
 * Created by Muffassa on 30.09.2015.
 */
public class Simbol {

    public static String[] revers(String[] string)
    {

        if(string[0] != "") {
            String[] result = new String[string.length];
            Stack<String> stack = new Stack<>();


            for (int i = 0; i < string.length; i++) {
                stack.push(string[i]);
            }

            for (int i = 0; i < string.length; i++) {
                result[i] = stack.pop();
            }

            return result;
        }
        else {
            String[] result = new String[0];
            return result;
        }
    }
}
