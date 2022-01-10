package ru.job4j.oop;

public class Dog {

    private String name;
    private String food;

    public void show() {
        System.out.println(this.name + " " + this.food);
    }

    public void eat(String food) {
        this.food = food;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Dog polcan = new Dog();
        polcan.giveNick("polcan");
        polcan.eat("Котлета");
        polcan.show();
        Dog sharik = new Dog();
        sharik.giveNick("sharik");
        sharik.eat("Сосиска");
        sharik.show();
        Dog zhychka = new Dog();
        zhychka.giveNick("zhychka");
        zhychka.eat("Тапок");
        zhychka.show();
    }
}
