package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student female = new Student();
        female.setName("Maya");
        female.setSurname("Shurdenko");
        female.setGroup("IRA-21");
        female.setIncoming(LocalDate.of(2021, 9, 11));
        System.out.println("Name: " + female.getName());
        System.out.println("Surname: " + female.getSurname());
        System.out.println("Group: " + female.getGroup());
        System.out.println("Date incoming: " + female.getIncoming());
    }
}
