package ru.omgtu.Labs.Lab_3.Task_9;

import java.util.Stack;

/**
 * Created by Muffassa on 29.09.2015.
 */
public class Main {
    public static void main(String[] args)
    {
        Stack stack = new Stack();

        int numbers[] = new int[]{1,2,3,4,5,6};

        for(int i = 0; i < numbers.length; i++)
        {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(stack.pop());
        }
    }
}
