package ru.job4j.lombok;

public class LombokUsage {
    public static void main(String[] args) {
        var prem = Permission.of()
                .id(1)
                .name("name")
                .accessBy("create")
                .accessBy("delete")
                .build();
        System.out.println(prem);
    }
}