package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        System.out.println("Hare try eat Ball, and ...");
        hare.tryEat(ball);
        System.out.println("Wolf try eat Ball, and ...");
        wolf.tryEat(ball);
        System.out.println("Fox try eat Ball, and ...");
        fox.tryEat(ball);
        System.out.println("That's all folks.");
    }
}
