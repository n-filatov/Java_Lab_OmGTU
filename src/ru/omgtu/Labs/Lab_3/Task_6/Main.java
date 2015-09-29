package ru.omgtu.Labs.Lab_3.Task_6;

import java.util.Stack;

/**
 * Created by Muffassa on 29.09.2015.
 */
public class Main {
    public static void main(String[] args)
    {
        Stack sum = new Stack();
        Stack pow = new Stack();

        int sumResult;
        int powResult;


        sumResult = Operation.sum(sum);
        powResult = Operation.pow(sum);

        System.out.print("Сумма: "+sumResult+" Умножение "+powResult);
    }
}
