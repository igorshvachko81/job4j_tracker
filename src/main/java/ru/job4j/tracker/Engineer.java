package ru.job4j.tracker;

public class Engineer extends Profession {
    private int level;

    public Engineer() {
    }

    public Engineer(String name, String surname, String education, String birthday, int level) {
        super(name, surname, education, birthday);
        this.level = level;
    }

    public void analyze() {
    }

    public void repair() {
    }

    public int quality() {
        return this.level;
    }
}
