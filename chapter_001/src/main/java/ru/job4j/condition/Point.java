package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;
    public Point(int first,int second) {
        this.x = first;
        this.y = second;
    }
    public Point(int first,int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /*public static double distance3d(Point first, Point second) {
        return sqrt(pow(second.x - first.x, 2) + pow(second.y - first.y, 2) + pow(second.z - first.z,2));
    }*/

    public double distance3d(Point another) {
        return sqrt(pow(another.x - this.x, 2) + pow(another.y - this.y, 2) + pow(another.z - this.z,2));
    }
    public double distance(Point another) {
        return sqrt(pow(another.x - this.x, 2) + pow(another.y - this.y, 2));
    }
    public static void main(String[] args) {
        Point a = new Point(0, 0,0);
        Point b = new Point(2, 2,2);
        double dist = a.distance3d(b);
       // double dist = a.distance3d(a,b);
        System.out.println(dist);
    }
}