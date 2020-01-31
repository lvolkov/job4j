package ru.job4j.array;
/**
 * метод ищет минимум в диапозоне массива
 *
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 2
 * @since 30.01.2020
 */
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
            for (int i = start; i <= finish; i++) {
                if (array[i] < min)
                    min = array [i];
            }
        return min;
    }
}