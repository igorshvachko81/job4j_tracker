package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] left = o1.split("/");
        String[] right = o2.split("/");
        int size = Math.min(left.length, right.length);
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                int res = right[i].compareTo(left[i]);
                if (res != 0) {
                    return res;
                }
            }
            if (i > 0) {
                int res = left[i].compareTo(right[i]);
                if (res != 0) {
                    return res;
                }
            }
        }
        return Integer.compare(left.length, right.length);
    }
}
