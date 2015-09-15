package ru.omgtu.Labs.lab_1_12;

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

    public double distanceTo(int x, int y, int z)
    {
        return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2)+Math.pow(z-this.z,2));
    }
}
