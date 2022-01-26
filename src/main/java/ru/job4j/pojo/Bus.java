package ru.job4j.pojo;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Везет пассажиров");
    }

    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();

        Vehicle[] vehicles = new Vehicle[]{bus, train, airplane};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}

