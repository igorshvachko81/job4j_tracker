package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private String drug;

    public Surgeon() {
    }

    public Surgeon(String name, String surname, String education, String birthday,
                   int grade,
                   String drug) {
        super(name, surname, education, birthday, grade);
        this.drug = drug;
    }

    public void makeSurgery() {
    }

    public String prescribeMedicine() {
        return drug;
    }
}
