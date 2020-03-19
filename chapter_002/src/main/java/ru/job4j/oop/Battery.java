package ru.job4j.oop;
/**
 * создаем конструктор Battery
 * cоздаем методбкоторый обнуляет значение переменной объекта и увеличивает на
 * это же значение переменную второго аналогичного объекта
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 20.02.2020
 */
public class Battery {
    private int load;
    public Battery(int charge) {
        this.load = charge;
    }
    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }
    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(15);
        System.out.println(first.load + " " + second.load);
        first.exchange(second);
        System.out.println(first.load + " " + second.load);
    }
}
