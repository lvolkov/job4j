package ru.job4j.array;

/** поиск по массиву в указанном диапазоне.
 * data - массив чисел,
 * el - элемент, который нужно найти,
 * start - индекс с которого начинаем поиск,
 * finish - индекс которым заканчиваем поиск.
 * если элемента нет в массиве, то возвращаем -1
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 30.01.2020
 */

public class FindLoop {
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}