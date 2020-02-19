package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Wolf gray = new Wolf();
        Hare white = new Hare();
        Fox red = new Fox();
        Ball colobok = new Ball();
        gray.tryEat(colobok);
        colobok.tryGo();
        white.tryEat(colobok);
        colobok.tryGo();
        red.tryEat(colobok);
        colobok.tryGo();
    }
}
