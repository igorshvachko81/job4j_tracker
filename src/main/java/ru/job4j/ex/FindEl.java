package ru.job4j.ex;

import java.util.Objects;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundExeption {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (Objects.equals(value[index], key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundExeption("Element not found.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] city = {"Miami", "Boston", "Chicago", "Los Angeles"};
        String check = "New York";
        try {
            indexOf(city, check);
        } catch (ElementNotFoundExeption z) {
            z.printStackTrace();
        }
    }
}

