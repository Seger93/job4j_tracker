package ru.job4j.oop;

public class Hare {
    public void tryEat(Ball ball) {
        ball.tryRun(false);
        System.out.println("Колобок сбежал");
    }
}
