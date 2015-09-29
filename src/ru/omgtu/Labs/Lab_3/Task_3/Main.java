package ru.omgtu.Labs.Lab_3.Task_3;

import java.util.HashMap;

/**
 * Created by Muffassa on 29.09.2015.
 */
public class Main {
    public static void main(String  args[]){
        HashMap<Integer, Integer> x =  new HashMap<Integer,Integer>();
        HashMap<Integer, Integer> y =  new HashMap<Integer,Integer>();
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        x.put(0,1);
        x.put(1,5);
        x.put(2,8);

        y.put(0, 8);
        y.put(1, 13);
        y.put(2, 2);

        result = Polynom.sum(x, y);

        for (int i = 0; i <result.size() ; i++) {
            System.out.print(result.get(i));
        }
    }
}
