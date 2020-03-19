package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;
    public void giveNick(String nick) {
        this.name = nick;
    }
    public void eat(String food) {
        this.food = food;
        System.out.println(this.name + " " + this.food);
    }
    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("котлету");
        Cat black = new Cat();
        black.giveNick("Черный");
        black.eat("рыбу");
    }
}
