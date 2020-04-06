package lesson;

public class LoadOrder {

    private static String static_field = echo("static field");

    private static final String STATIC_FINAL_FIELD = echo("static final field");

    {
        echo("not-static block");
    }

    static {
        echo("static block");
    }

    private String surname = echo("field");

    private final String name = echo("final field");

    public LoadOrder(String msg) {
        echo("constructor " + msg);
    }

    public static String echo(String text) {
        System.out.println(text);
        return text;
    }
    // Загрузка статичных элементов будет осуществляться всегда. Она происходит при загрузки класса в виртуальную машину.
    //Вопрос. Можно ли сделать класс, который не инициализировал статические блоки при загрузки класса в виртуальную машину?
    //Ответ. Да можно. За счет создания статических внутренних классов.
    //Давайте добавим в наш код следующий класс.
    private static final class Holder {
        private static final LoadOrder INSTANCE = new LoadOrder("static inner field");
    }

    public static void main(String[] args) {
        //Если мы уберем создания объекта в методе main.
        //LoadOrder order = new LoadOrder("main");
    }
}