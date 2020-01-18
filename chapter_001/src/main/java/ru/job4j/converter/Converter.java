package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int rubleToDollar(int value) {

        return value / 60;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
        public static void main(String[] args) {
            int euro = rubleToEuro(250);
            int dollar = rubleToDollar(250);
            int rubleEuro = euroToRuble(250);
            int rubleDollar = dollarToRuble(250);
        System.out.println("250 rubles are " + euro + " euro.");
        System.out.println("250 rubles are " + dollar + " dollars.");
        System.out.println("250 euro are " + rubleEuro + " ruble.");
        System.out.println("250 dollars are " + rubleDollar + " ruble.");
           int in = 140;
           int expected = 2;
           int out = rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2 EURO. Test result : " + passed);

            int inRubUsd = 120;
            int expectedRubUsd =2;
            int outRubUsd = rubleToDollar(inRubUsd);
            boolean passedRubUsd = expectedRubUsd == outRubUsd;
            System.out.println("120 rubles are 2 USD. Test result : " + passedRubUsd);

            // test false
            int inUsdRub = 5;
            int expectedUsdRub =240;
            int outUsdRub = dollarToRuble(inUsdRub);
            boolean passedUsdRub = expectedUsdRub == outUsdRub;
            System.out.println("5 USD are 240 Rub. Test result : " + passedUsdRub);

            int inEuroRub = 4;
            int expectedEuroRub =280;
            int outEuroRub = euroToRuble(inEuroRub);
            boolean passedEuroRub = expectedEuroRub == outEuroRub;
            System.out.println("4 EURO are 280 Rub. Test result : " + passedEuroRub);
    }
}