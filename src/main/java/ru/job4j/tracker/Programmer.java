package ru.job4j.tracker;

public class Programmer extends Engineer {
    private String language;

    public Programmer() {
    }

    public Programmer(String name, String surname, String education, String birthday,
                      int level,
                      String language) {
        super(name, surname, education, birthday, level);
        this.language = language;
    }

    public void makeAlgorithm() {
    }

    public void writeCode() {
    }

    public void productSupport() {
    }
}
