package ru.job4j.tracker;

public class Engineer extends Profession {
    private int level;

    public void analyze() {
    }

    public void repair() {
    }

    public int quality() {
        return this.level;
    }
}
