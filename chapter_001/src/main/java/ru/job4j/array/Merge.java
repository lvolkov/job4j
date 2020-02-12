package ru.job4j.array;

import java.util.Arrays;
/**
 * метод образующий новый массив из двух заданных
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 12.02.2020
 */
public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0; // создаем счетчики индексов массивов left и right
        while (i < left.length && j < right.length) { //пока не закончится полный перебор значений одного из заданных массивов
               if (left[i] > right[j]) {
                rsl[i + j] = right[j];
                j++;
            } else {
                rsl[i + j] = left[i];
                i++;
            }
        }
        while (i+j<left.length+right.length) { //пока не закончится перебор значений нового массива
                if (i == left.length){ // проверяем значения какого из заданных массивов были полностью перебраны
                    rsl[i+j] = right[j]; // дописываем новый массив оставшимися значениями
                    j++;
                } else {
                    rsl[i+j] = left[i];
                    i++;
                }
        }
        return rsl;
    }
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {4, 8,}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

