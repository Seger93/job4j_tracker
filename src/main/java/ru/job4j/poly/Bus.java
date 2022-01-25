package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void passenger(int pass) {
        System.out.println("Passenger in a buss " + pass);
    }

    @Override
    public int refuel(int gas) {
        int money = 52;
        int prise =  money * gas;
        System.out.println("Prise is " + prise);
        return prise;
    }
}
