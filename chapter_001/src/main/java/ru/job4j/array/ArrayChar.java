package ru.job4j.array;
/**
 * метод проверяет, что слово начинается c определенной последовательности
 *
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 30.01.2020
 */
public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        String Word = new String (word); // переводим текстовый массив word в строку
        String Pref = new String (pref); // переводим текстовый массив pref в строку
        if (!Word.startsWith(Pref)) {  // проверяем условие не совпадения начала строки
            result = false;
        }
        return result;
    }
}