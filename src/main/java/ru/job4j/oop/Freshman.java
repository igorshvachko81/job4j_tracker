package ru.job4j.oop;

public class Freshman extends Student {
    private String name;
    private int iq;

    public Freshman(String name, int iq) {
        this.name = name;
        this.iq = iq;
    }

    public Freshman() {
    }

    public void playFootball(String position) {
        System.out.println(name + " playing football on position " + position);
    }

    @Override
    public void song() {
        System.out.println("Bang-bang, she-dub-ta-da-da...");
    }
}
