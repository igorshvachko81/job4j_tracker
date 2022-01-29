package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int range = Math.min(left.length(), right.length());
        int rez;
        for (int index = 0; index < range; index++) {
            rez = Character.compare(left.charAt(index), right.charAt(index));
            if (rez != 0) {
                return rez;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}