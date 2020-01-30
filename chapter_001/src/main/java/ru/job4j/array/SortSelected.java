package ru.job4j.array;
/**
 * сортировка выборкой
 *
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 30.01.2020
 */
public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i=0 ; i<data.length ; i++){
            int min = MinDiapason.findMin(data, i, data.length-1);
            int index = FindLoop.indexOf(data, min, i, data.length-1);
            int temp = data[i];
            data[i] = min;
            data[index]=temp;
        }
        return data;
    }
}
