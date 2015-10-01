package ru.omgtu.Labs.Lab_3.Task_12;



/**
 * Created by Muffassa on 29.09.2015.
 */
import java.util.Vector;

public class Main {
    public static void main(String[] args)
    {
        Double d = new Double(0);
        double[] array = new double[args.length];

        for (int i = 0; i <args.length ; i++) {
            array[i] = d.parseDouble(args[i]);
        }

        Vector vector = new Vector();
        vector = ru.omgtu.Labs.Lab_3.Task_12.Vector.add(array);

        for (int i = 0; i < vector.size(); i++ )
        {
            System.out.println(vector.elementAt(i));
        }
    }
}
