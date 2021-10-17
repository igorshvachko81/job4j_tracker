package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] arrayItems = new Item[100];
        int indexItems = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName() != null && item.getName() == key) {
                arrayItems[indexItems] = item;
                indexItems++;
            }
        }
        return Arrays.copyOf(arrayItems, indexItems);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}