package ru.omgtu.Labs.Lab_3.Task_6;

import java.util.Stack;

/**
 * Created by Muffassa on 29.09.2015.
 */
public class Operation {
    public static int sum(Stack<Integer> stack)
    {
        int result = 0;

        for (int i = 0; i <stack.size() ; i++) {
            result += stack.get(i);
        }

        return result;
    }

    public static int pow(Stack<Integer> stack)
    {
        int result = 1;

        for (int i = 0; i <stack.size() ; i++) {
            result *= stack.get(i);
        }
        return result;
    }
}
