package ru.job4j.array;
/**
 * Класс проверяет, существует ли в двухмерной квадратной матрице комбинация символов X
 * полностью заполняющих вертикаль или горизонталь
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 01.02.2020
 */
public class MatrixCheck {
    //создаем метод проверки заполненной горизонтали
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    //создаем метод проверки заполненной вертикали
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
   // метод создания массива из диагонали,в поиске выигрышной позиции не применяется.
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
    // создаем метод поиска выигрышной позиции
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}

