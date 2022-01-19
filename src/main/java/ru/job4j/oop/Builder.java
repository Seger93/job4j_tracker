package ru.job4j.oop;

public class Builder extends Engineer {
    private String work;

    public Builder(String name, String surname, String education, String birthday, String drawing, String work) {
        super(name, surname, education, birthday, drawing);
        this.work = work;
    }

    public void work(String work) {

    }

}
