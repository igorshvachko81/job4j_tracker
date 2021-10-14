package ru.job4j.tracker;

public class Builder extends Engineer {
    private boolean repair;

    public Builder() {
    }

    public Builder(String name, String surname, String education, String birthday,
                      int level,
                      boolean repair) {
        super(name, surname, education, birthday, level);
        this.repair = repair;
    }

    public void makeProject() {
    }

    public void construction() {
    }
}
