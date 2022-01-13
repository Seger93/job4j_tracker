package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int c) {
        return c - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        int result2 = Calculator.minus(11);
        Calculator calculator = new Calculator();
        int rsl = calculator.divide(15);
        Calculator calculator1 = new Calculator();
        int rsl2 = calculator1.sumAllOperation(2);
        Calculator calculator2 = new Calculator();
        int rsl3 = calculator2.multiply(7);
        System.out.println(rsl3);
        System.out.println(rsl2);
        System.out.println(rsl);
        System.out.println(result);
        System.out.println(result2);
    }
}

