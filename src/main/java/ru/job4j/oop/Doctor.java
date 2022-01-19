package ru.job4j.oop;

public class Doctor extends Profession {
    String heals;

    public Doctor(String name, String surname, String education, String birthday, String heals) {
        super(name, surname, education, birthday);
        this.heals = heals;
    }

    public void diagnoz(String pilyla) {

    }

}

