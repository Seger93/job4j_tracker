package ru.job4j.oop;

public class Dentist extends Doctor {
    private String money;

    public Dentist(String name, String surname, String education, String birthday, String money, String heals) {
        super(name, surname, education, birthday, heals);
        this.money = money;
    }

    public void giveYouMoney(String money) {

    }
}
