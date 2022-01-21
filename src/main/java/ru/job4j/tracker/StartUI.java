package ru.job4j.tracker;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class StartUI {
    public static void main(String[] args) {
        Item time = new Item();
        LocalDateTime currentDateTime = time.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println(currentDateTimeFormat);
    }
}
