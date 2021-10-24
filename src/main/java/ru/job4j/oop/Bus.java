package ru.job4j.oop;

public class Bus implements Vehicle {
    private int seats;

    public Bus(int seats) {
        this.seats = seats;
    }

    public Bus() {
    }

    @Override
    public void move() {
        System.out.println("Автобус передвигается по дорогам.");
    }

    @Override
    public void fuel() {
        System.out.println("Автобус заправляется бензином.");
    }
}
