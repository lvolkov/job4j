package ru.job4j.array;
/**
 * метод перемещающий пустые ячейки массива в конец
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 3
 * @since 07.02.2020
 */
public class Defragment {
    public static String[] compress(String[] array) {
        //int cell = 0; // определяем первую ячейку массива в которую будет произведена запись не пустого значения
        for (int index = 0; index < array.length; index++) {
                if (array[index] == null) {
                int point = index; // создаем переменную и присваиваем ей индекс первой пустой ячейки
                while (array[point] == null && point < array.length-1) {
                    point++; //определяем первый индекс не нулевой ячейки
                }
                String temp = array[index]; // записываем "в корзину" данные первой пустой ячейки массива
                array[index] = array[point]; // копируем в первую ячейку массива данные из первой найденной заполненной ячейки
                array[point] = temp; // перемещаем первую не null ячейку
            }
                 System.out.print(array[index] + " "); // не понятно для чего это команда?
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

