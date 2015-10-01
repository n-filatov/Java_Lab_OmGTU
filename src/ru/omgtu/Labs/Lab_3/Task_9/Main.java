package ru.omgtu.Labs.Lab_3.Task_9;

import java.util.Stack;

/**
 * Created by Muffassa on 29.09.2015.
 */
public class Main {
    public static void main(String[] args)
    {
        Stack stack = new Stack();

        String[] string = new String[]{"s","t","r","i","n","g"};

        String[] reversString = new String[string.length];

        reversString = Simbol.revers(string);


        if(reversString.length!= 0) {
            for (int i = 0; i < reversString.length; i++) {
                System.out.println(reversString[i]);
            }
        }
        else System.out.println("String is empty");
    }
}
