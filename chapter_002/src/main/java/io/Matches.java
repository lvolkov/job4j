package io;

import java.util.Scanner;

public class Matches {
    Scanner scanner = new Scanner(System.in);
    public int select() {
        int s = Integer.parseInt(scanner.nextLine());
        while (s > 3) {
            System.out.println("Вы взяли больше 3-х спичек. Возьмите от 1 до 3 спичек.");
            s = Integer.parseInt(scanner.nextLine());
        }
        return s;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matches matches = new Matches();
        System.out.println("Введите имя первого игрока");
        String gamer1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока");
        String gamer2 = scanner.nextLine();
        int count = 1;
        int m = 11;
        while (m > 0) {
            if (count%2==0) {
                System.out.println(gamer1 + "- возьмте спичку от 1 до 3 шт.");
            } else {
                System.out.println(gamer2 + "- возьмте спичку от 1 до 3 шт.");
            }
            m = m - matches.select();
            if (m != 0) {
                System.out.println("Осталось " + m + "спичек");
            count++;
            } else {
                System.out.println("Вы выиграли");
            }
        }
    }
}
