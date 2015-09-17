package ru.omgtu.Labs.Lab_1.Task_12;

/**
 * Created by muffassa on 15.09.15.
 */
public class Dot {
    public int x,
        y,
        z;

    public Dot(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanceTo(Dot dot)
    {
        return Math.sqrt(Math.pow(dot.x-this.x,2)+Math.pow(dot.y-this.y,2)+Math.pow(dot.z-this.z,2));
    }
}
