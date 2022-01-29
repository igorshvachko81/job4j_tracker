package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String str1 = left.split("\\.")[0];
        String str2 = right.split("\\.")[0];
        int number1 = Integer.parseInt(str1, 10);
        int number2 = Integer.parseInt(str2, 10);
        return Integer.compare(number1, number2);
    }
}