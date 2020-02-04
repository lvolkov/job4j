package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = false;
        for (int i = 2; i <= finish; i++) {
            if (i != finish && finish % i == 0) {
                prime = false;
                break;
            }
             prime = true;
        }
        return prime;
    }
}