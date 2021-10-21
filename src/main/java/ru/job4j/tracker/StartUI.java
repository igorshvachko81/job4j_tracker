package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item localTime = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        LocalDateTime ldt = localTime.getCreated();
        String dt = ldt.format(formatter);
        System.out.println(dt);
        System.out.println(localTime);
    }
}
