package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double debt = amount + amount * (percent) / 100;
        while (salary < debt) {
            year++;
            debt = (debt - salary) + (debt - salary) * (percent) / 100;
        }
        return year;
    }
}