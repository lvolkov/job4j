package ru.job4j.array;
/**
 * создаем матрицу таблицы умножения
 *
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 30.01.2020
 */
public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                table[j][i] = (j + 1) * (i + 1);
            }
        }
        return table;
    }
}