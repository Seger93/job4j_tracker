package ru.job4j.oop;

public class Surgeon extends Doctor {

    private String operation;

    public Surgeon(String name, String surname, String education, String birthday, String operation, String heals) {
        super(name, surname, education, birthday, heals);
        this.operation = operation;
    }

    public void inspection(String pacient) {

    }
}
