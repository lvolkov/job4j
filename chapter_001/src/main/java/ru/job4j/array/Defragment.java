package ru.job4j.array;
/**
 * метод перемещающий пустые ячейки массива в конец
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 07.02.2020
 */
public class Defragment {
    public static String[] compress(String[] array) {
        int cell = 0; // определяем первую ячейку массива в которую будет произведена запись не пустого значения
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) { // определяем номер первой не пустой ячейки
                String temp = array[cell]; // записываем "в корзину" данные первойй ячейки массива
                array[cell] = array[index]; // копируем в первую ячейку массива данные из первой найденной заполненной ячейки
                array[index] = temp; // копируем в освободившуюся ячеку данные из "корзины"
                cell++; // выбираем для копирования не пустого значения следующую ячейку массива
                    //int point = index; // указатель, на не null ячейку.*/
                    // переместить первую не null ячейку
                    // Здесь нужен цикл while
            }
                // System.out.print(array[index] + " "); // не понятно для чего это команда?
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

