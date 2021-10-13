package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private String drug;
    private String skills;

    public void makeSurgery() {
    }

    public String prescribeMedicine() {
        return drug;
    }
}
