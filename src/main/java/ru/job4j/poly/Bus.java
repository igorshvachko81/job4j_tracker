package ru.job4j.poly;

public class Bus implements Transport {
    private int number;
    private int litres;
    private double cost;

    @Override
    public void ride() {
        System.out.println("Поехали!");
    }

    @Override
    public void passengers(int number) {
        this.number = number;
    }

    @Override
    public double refuel(int litres) {
        double price = 30;
        this.litres = litres;
        cost = price * this.litres;
        return cost;
    }
}
