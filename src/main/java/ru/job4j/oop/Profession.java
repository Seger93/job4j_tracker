package ru.job4j.oop;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public Profession() {
    }

    public String getName(String name) {
        return this.name;
    }

    public String getSurname(String surname) {
        return this.surname;
    }

    public String getEducation(String education) {
        return this.education;
    }

    public String getBirthday(String birthday) {
        return this.birthday;
    }

}
