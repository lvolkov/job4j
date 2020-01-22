package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double debt= amount+amount*(percent)/100; //годовая задолженность банку

        while (salary<debt){
            year++;
            debt=(debt-salary)+(debt-salary)*(percent)/100; // перерасчет задолженности после годовой выплаты
        }

        return year;
    }
}