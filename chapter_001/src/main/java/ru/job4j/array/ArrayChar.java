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
        for (int i=0; i<pref.length; i++) {
            if (pref[i]!= word [i]) {
                    result=false;
                    break;
            }
        }
        return result;
    }
}