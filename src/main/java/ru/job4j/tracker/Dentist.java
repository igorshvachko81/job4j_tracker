package ru.job4j.tracker;

public class Dentist extends Doctor {
    private boolean replacement;

    public Dentist() {
    }

    public Dentist(String name, String surname, String education, String birthday,
                   int grade,
                   boolean replacement) {
        super(name, surname, education, birthday, grade);
        this.replacement = replacement;
    }

    public void anesthesia() {
    }

    public void dentistry() {
    }

    public void extractTooth() {
    }
}
