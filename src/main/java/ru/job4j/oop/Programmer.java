package ru.job4j.oop;

public class Programmer extends Engineer {
    private String java;

    public Programmer(String name, String surname, String education, String birthday, String drawing, String java) {
        super(name, surname, education, birthday, drawing);
        this.java = java;
    }

    public void fixBag(String bag) {

    }

}
