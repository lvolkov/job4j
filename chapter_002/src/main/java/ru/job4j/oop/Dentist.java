package ru.job4j.oop;

public class Dentist extends Doctor {
    private String location = "Поликлиника";
    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }
    public void treatTeeth() {
        // лечит зубы
    }
}
