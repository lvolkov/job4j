package ru.job4j.loop;
/**
 *  добавить условие, по которому нужно определить ставить ли символ или нет
 *  добавить условие, что нужно ставить элемент в правый угол.
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 2
 * @since 27.01.2020
 */
public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = cell == row ? true : false;
                boolean right = cell == size - row - 1 ? true : false;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}