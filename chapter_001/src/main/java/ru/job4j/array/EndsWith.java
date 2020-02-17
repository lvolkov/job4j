package ru.job4j.array;
/**
 * метод проверяет, что слово заканчивается определенной последовательностью
 *
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 3
 * @since 30.01.2020
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i])  {
            result = false;
            break;
            }
        }
        return result;
    }
}
