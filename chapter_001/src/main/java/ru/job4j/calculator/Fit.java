package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return 1.15*(height-100);
    }
    public static double womanWeight(double height) {
        return 1.15*(height-110);
    }

    public static void main(String[] args) {
        double man = manWeight(176);
        double woman = womanWeight(170);
        System.out.println("Man 176 is " + man);
        System.out.println("Woman 170 is " + woman);
    }

}