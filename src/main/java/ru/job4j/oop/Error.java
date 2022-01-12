package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Состояние " + active);
        System.out.println("Статус " + status);
        System.out.println("Сообщение " + message);
    }

    public static void main(String[] args) {
        Error fourZeroFour = new Error();
        fourZeroFour.printInfo();
        Error three = new Error(true, 4, "Работает");
        three.printInfo();
        Error two = new Error(false, 3, "Не работает");
        two.printInfo();
    }
}
