package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sergei");
        student.setDate("20.01.22");
        student.setGroup("#13");
        System.out.println(student.getName() + " : " + student.getDate() + " Group " + student.getGroup());
    }
}
