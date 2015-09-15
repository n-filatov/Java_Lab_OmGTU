package ru.omgtu.Labs.lab_1_12;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by muffassa on 15.09.15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        Dot dot[]  = new Dot[n];
        double[] sumOfDistances = new double[n];
        double minSumOfDistances = 0;
        int idOfMinDot = 0;

        dot[0] = new Dot(6,3,12);
        dot[1] = new Dot(2,31,2);
        dot[2] = new Dot(8,24,5);



        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n-1; j++)
                sumOfDistances[i] += dot[i].distanceTo(dot[j].x, dot[j].y, dot[j].z);
        }

        for(int i = 0; i < n; i++)
        {
            if(minSumOfDistances > sumOfDistances[i])
            {
                minSumOfDistances = sumOfDistances[i];
                idOfMinDot = i;
            }
        }

        System.out.println("Сумма растояний от точки с координатами: ("+
                dot[idOfMinDot].x+","+dot[idOfMinDot].y+","+dot[idOfMinDot].z+") минимальна");


    }
}
