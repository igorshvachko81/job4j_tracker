package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start = start + el + "/";
            }
        }
        System.out.println();
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> departs) {
        Collections.sort(departs);
    }

    public static void sortDesc(List<String> departs) {
        Collections.sort(departs, new DepDescComp());
    }

    public static void main(String[] args) {
        List<String> depart = Arrays.asList("K1/SK1", "K1/SK1/SSK1", "K1/SK2",  "K1/SK1/SSK2",
                 "K2/SK1/SSK1", "K2", "K2/SK1/SSK2");
        List<String> fulldep = Departments.fillGaps(depart);
        for (String str : fulldep) {
            System.out.println(str);
        }
        Departments.sortAsc(fulldep);
        System.out.println("After sort asc");
        for (String str : fulldep) {
            System.out.println(str);
        }
        Departments.sortDesc(fulldep);
        System.out.println("After sort desc");
        for (String str : fulldep) {
            System.out.println(str);
        }
    }
}
