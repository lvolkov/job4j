package ru.job4j.calculator;

/**
 * Package for calculate task.
 *
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 21.01.2020
 */
public class Calculator {

    public static void add (double first, double second) {
        double result=first+second;
        System.out.println(first + " + " + second + " = " + result);
    }
    public static void div (double first, double second) {
        double result=first/second;
        System.out.println(first + " / " + second + " = " + result);
    }
    public static void multiply (double first, double second) {
        double result=first*second;
        System.out.println(first + " * " + second + " = " + result);
    }
    public static void subtrack(double first, double second) {
        double result=first-second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Конструктор вывода данных в консоль
     * @param args- first первый аргумент
     * @param args- second второй аргумент
     */
    public static void main(String[] args) {
        add (1, 1);
        div (3, 4);
        multiply (6, 6);
        subtrack (1, 8);
    }
}