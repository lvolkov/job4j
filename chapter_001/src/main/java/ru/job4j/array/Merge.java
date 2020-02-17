package ru.job4j.array;

import java.util.Arrays;
/**
 * метод образующий новый массив из двух заданных
 * создаем счетчики индексов массивов left и right
 * 1 цикл while пока не закончится полный перебор значений одного из заданных массивов
 * 2 цикл while пока не закончится перебор значений нового массива
 * дописываем новый массив оставшимися значениями
 * проверяем значения какого из заданных массивов были полностью перебраны
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 12.02.2020
 */
public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0; //
        while (i < left.length && j < right.length) {
               if (left[i] > right[j]) {
                rsl[i + j] = right[j];
                j++;
            } else {
                rsl[i + j] = left[i];
                i++;
            }
        }
        while (i+j<left.length+right.length) {
                if (i == left.length) {
                    rsl[i+j] = right[j];
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
                new int[] {4, 8, 9}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

