package ru.job4j.array;
/**
 * метод перемещающий пустые ячейки массива в конец
 * @author Leonid Volkov (l.volkov@list.ru)
 * в цикле while определяем первый индекс не нулевой ячейки
 * записываем в "корзину" данные первой пустой ячейки массива
 * копируем в первую ячейку массива данные из первой найденной заполненной ячейки и
 * перемещаем первую не null ячейку
 *
 * @version 3
 * @since 07.02.2020
 */
public class Defragment {
    public static String[] compress(String[] array) {
         for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (array[point] == null && point < array.length-1) {
                    point++;
                }
                    String temp = array[index];
                    array[index] = array[point];
                    array[point] = temp;
            }
                 System.out.print(array[index] + " ");
            }
            return array;
        }

        public static void main(String[]args) {
            String[] input = {"I", null, null, null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int index = 0; index < compressed.length; index++) {
                System.out.print(compressed[index] + " ");
            }
        }
}

