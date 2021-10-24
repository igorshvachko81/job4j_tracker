package ru.job4j.oop;

public class Train implements Vehicle {
    private int seats;
    private int wagons;

    public Train(int seats, int wagons) {
        this.seats = seats;
        this.wagons = wagons;
    }

    public Train() {
    }

    @Override
    public void move() {
        System.out.println("Поезд передвигается по рельсам.");
    }

    @Override
    public void fuel() {
        System.out.println("Поезд заправляется дизельным топливом.");
    }
}
