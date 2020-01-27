package ru.job4j.array;
/**
 *  проверка, что все элементы в массиве являются или true или false.
 *
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 27.01.2020
 */

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
           for (int i=0;i<data.length;i++) {
               if (data[0] == data[i]) {
                   result = true;
               } else {
                   result = false;
                   break;
               }
           }
        return result;
    }
}