package ru.job4j.tracker;

public class Doctor extends Profession {
    private int grade;

    public Doctor() {
    }

    public Doctor(String name, String surname, String education, String birthday, int grade) {
        super(name, surname, education, birthday);
        this.grade = grade;
    }

    public void diagnosis() {
    }

    public void firstAid() {
    }

    public void heal() {
    }
}
