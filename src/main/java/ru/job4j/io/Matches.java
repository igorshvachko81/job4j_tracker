package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            while (matches < 1 || matches > 3) {
                System.out.println("Число должно быть от 1 до 3!Введите число из этого диапазона.");
                System.out.println(player + ", введите число.");
                matches = Integer.parseInt(input.nextLine());
            }
            turn = !turn;
            count = count - matches;
            if (count < 0) {
                count = 0;
            }
            System.out.println("Осталось " + count + " спичек");
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}