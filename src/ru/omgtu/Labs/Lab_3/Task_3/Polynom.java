package ru.omgtu.Labs.Lab_3.Task_3;

import java.util.HashMap;

/**
 * Created by Muffassa on 29.09.2015.
 */
public class Polynom {

    public static HashMap sum(HashMap<Integer,Integer> x, HashMap<Integer,Integer> y)
    {
        HashMap<Integer, Integer> result = new HashMap<Integer,Integer>();
        for (int i = 0; i <x.size() ; i++) {
            x.get(i);
            result.put(i, (x.get(i) + y.get(i)));
        }
        return result;
    }


}
