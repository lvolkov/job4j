package ru.job4j.oop;

public class Programmer extends Engeneer {
    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }
    public Soft codding(Project project) {
        // пишет программу проекта
        return new Soft();
    }
}
