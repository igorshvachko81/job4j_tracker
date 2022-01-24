package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int index = 0;
        int rez;
        while (index < left.length() && index < right.length()) {
            rez = Character.compare(left.charAt(index), right.charAt(index));
            if (rez == 0) {
                index++;
            } else {
                return rez;
            }
        }
        rez = Integer.compare(left.length(), right.length());
        return rez;
    }
}