package ru.job4j.condition;

/*public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int a = x2 - x1;
        int b = y2 - y1;
        double c = Math.pow(a, 2);
        double d = Math.pow(b, 2);
        double sqrt = Math.sqrt(c + d);
        return sqrt;
    }
    public static void main(String[] args) {
        double result = distance(2, 2, 0, 0);
        System.out.println("result (2, 2) to (0, 0) " + result);
    }
}*/

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    public Point(int first,int second){
        this.x = first;
        this.y = second;
    }
    public double distance(Point another) {
        return sqrt(pow(another.x - this.x, 2) + pow(another.y - this.y, 2));
    }
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}