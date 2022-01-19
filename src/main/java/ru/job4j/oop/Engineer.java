package ru.job4j.oop;

public class Engineer extends Profession {
    private String drawing;

    public Engineer(String name, String surname, String education, String birthday, String drawing) {
        super(name, surname, education, birthday);
        this.drawing = drawing;
    }

    public void craft(String craft) {

    }
}
