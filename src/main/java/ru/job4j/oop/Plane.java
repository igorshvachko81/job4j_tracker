package ru.job4j.oop;

public class Plane implements Vehicle {
    private int seats;

    public Plane(int seats) {
        this.seats = seats;
    }

    public Plane() {
    }

    @Override
    public void move() {
        System.out.println("Самолет передвигается по воздуху.");
    }

    @Override
    public void fuel() {
        System.out.println("Самолет заправляется керосином.");
    }
}
