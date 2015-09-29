package ru.omgtu.Labs.Lab_3.Task_12;

/**
 * Created by Muffassa on 29.09.2015.
 */

public class Vector {
    public static java.util.Vector add(double[] array)
    {
        java.util.Vector<Double> vector = new java.util.Vector<Double>();

        for (int i = 0; i < array.length ; i++) {
            vector.add(array[i]);
        }

        return vector;
    }
}
