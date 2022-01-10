package ru.job4j.oop;

public class Wolf {
    public void tryEat(Ball ball) {
        ball.tryRun(false);
        System.out.println("колобок сбежал");
    }
}
