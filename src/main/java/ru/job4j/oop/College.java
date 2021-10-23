package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman coolman = new Freshman("Corbin", 169);
        Student lairy = new Student();
        Student oneof = coolman;
        Object obj = coolman;

        coolman.playFootball("\"Center forward\".");
        coolman.song();
        lairy.song();
        oneof.song();
        System.out.println(obj.getClass());
    }
}
