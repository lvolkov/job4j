package ru.job4j.condition;

public class Point {
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
}