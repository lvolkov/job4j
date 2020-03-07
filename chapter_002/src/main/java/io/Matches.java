package io;

import java.util.Scanner;

public class Matches {
    Scanner scanner = new Scanner(System.in);
    public int select() {
        System.out.println("Ваш ход - возьмте спичку от 1 до 3 шт.");
        int s = Integer.parseInt(scanner.nextLine());
        while (s > 3) {
            System.out.println("Вы взяли больше 3-х спичек. Возьмите от 1 до 3 спичек.");
            s = Integer.parseInt(scanner.nextLine());
        }
        return s;
        }
    public static void main(String[] args) {
        Matches matches = new Matches();
        int m = 11;
        while (m > 0) {
            m = m - matches.select();
            if (m != 0) {
                System.out.println("Осталось " + m + "спичек");
            } else {
                System.out.println("Вы выиграли");
            }
        }
    }
}
