package ru.job4j.pojo;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Летит");
    }
}
