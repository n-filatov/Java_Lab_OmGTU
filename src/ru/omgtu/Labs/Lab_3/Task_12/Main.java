package ru.omgtu.Labs.Lab_3.Task_12;



/**
 * Created by Muffassa on 29.09.2015.
 */
import java.util.Vector;

public class Main {
    public static void main(String[] args)
    {
        double[] array = new double[]{0.1,2.3,4.5};

        Vector vector = new Vector();
        vector = ru.omgtu.Labs.Lab_3.Task_12.Vector.add(array);

        for (int i = 0; i < vector.size(); i++ )
        {
            System.out.println(vector.elementAt(i));
        }
    }
}
