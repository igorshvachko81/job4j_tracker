package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner oracle = new Scanner(System.in);
        System.out.print("I am magic ball. And I can predict future. Ask your question. ");
        String question = oracle.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Answer on question \"" + question + "\" is " + "Yes");
        } else if (answer == 1) {
            System.out.println("Answer on question \"" + question + "\" is " + "No");
        } else {
            System.out.println("Answer on question \"" + question + "\" is " + "Maybe");
        }
    }

}
