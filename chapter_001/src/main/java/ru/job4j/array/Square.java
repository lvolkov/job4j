package ru.job4j.array;
/**
 * заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 01.02.2020
 */
public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}