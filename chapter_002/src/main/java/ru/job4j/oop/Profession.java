package ru.job4j.oop;

public class Profession {
    private String name, surname, education, birthday;
    public Profession(String name,String surname,String education,String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getEducation(){
        return this.education;
    }
    public String getBirthday(){
        return this.birthday;
    }

}
