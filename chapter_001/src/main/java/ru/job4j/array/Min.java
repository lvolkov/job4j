package ru.job4j.array;
/**
 * метод ищет минимум в массиве
 *
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 30.01.2020
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            // проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
            if (array[index]<min) {
                min = array[index];
            }
            continue;
        }
        return min;
    }
}
