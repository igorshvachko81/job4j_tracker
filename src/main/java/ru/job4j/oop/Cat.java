package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Cat " + this.name + " eat " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();
        gav.eat("kotleta");
        black.eat("fish");
        gav.giveNick("gav");
        black.giveNick("black");
        gav.show();
        black.show();
    }
}
