package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle airbus = new Plane(350);
        Vehicle tgv = new Train(250, 5);
        Vehicle topbus = new Bus(50);
        Vehicle[] vehicles = {airbus, tgv, topbus};
        for (Vehicle model:vehicles) {
            model.move();
            model.fuel();
        }
    }
}
