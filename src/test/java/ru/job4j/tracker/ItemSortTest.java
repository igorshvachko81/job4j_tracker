package ru.job4j.tracker;

import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSortTest {

    @Test
    public void whenSortByAsc() {
        List<Item> items = Arrays.asList(
                new Item(34, "book"),
                new Item(17, "clock"),
                new Item(27, "phone"),
                new Item(49, "apple")
                );
        List<Item> expected = Arrays.asList(
                new Item(49, "apple"),
                new Item(34, "book"),
                new Item(17, "clock"),
                new Item(27, "phone")
        );
        Collections.sort(items, new ItemAscByName());
        Assert.assertEquals(expected, items);
    }

    @Test
    public void whenSortByDesc() {
        List<Item> items = Arrays.asList(
                new Item(34, "book"),
                new Item(17, "clock"),
                new Item(27, "phone"),
                new Item(49, "apple")
        );
        List<Item> expected = Arrays.asList(
                new Item(27, "phone"),
                new Item(17, "clock"),
                new Item(34, "book"),
                new Item(49, "apple")
        );
        Collections.sort(items, new ItemDescByName());
        Assert.assertEquals(expected, items);
    }
}
