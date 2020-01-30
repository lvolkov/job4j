package ru.job4j.array;
/**
 * метод проверяет, что слово заканчивается определенной последовательностью
 *
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 30.01.2020
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        String Word = new String (word);
        String Post = new String (post);
        if (Word.endsWith(Post)!=true) {
            result = false;
        }
        return result;
    }
}
