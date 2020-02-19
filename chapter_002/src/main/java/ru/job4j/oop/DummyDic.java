package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
       String translate = "неизвестное слово - " + eng;
       return translate;
       }
    public static void main(String[] args) {
        DummyDic bot = new DummyDic();
        String rus = bot.engToRus("environment");
        System.out.println(rus);
    }
}
