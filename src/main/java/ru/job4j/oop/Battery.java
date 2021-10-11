package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int energy) {
        this.load = energy;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(100);
        Battery two = new Battery(270);
        System.out.println("Energy of the first battery = " + one.load);
        System.out.println("Energy of the second battery = " + two.load);
        one.exchange(two);
        System.out.println("Energy of the first battery = " + one.load);
        System.out.println("Energy of the second battery = " + two.load);
    }
}
