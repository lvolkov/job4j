package ru.job4j.condition;

public class TrgArea {
    private Point third;
    private Point first;
    private Point second;
    public TrgArea(Point ap, Point bp, Point cp) {
            this.first = ap;
            this.second = bp;
            this.third = cp;
    }
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    public static boolean exist(double a, double c, double b) {
        return a + c > b && c + b > a && b + a > c;
    }
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
             rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

}