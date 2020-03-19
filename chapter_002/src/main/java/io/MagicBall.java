package io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Задайте вопрос");
        Scanner qvst = new Scanner(System.in);
        String name = qvst.nextLine();
        Random random = new Random();
        int x = random.nextInt(3);
        if (x == 0) {
            System.out.println("Да");
        } else if (x == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
