package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenFewOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("34ds", "Bag"));
        orders.add(new Order("4f5r", "Shirt"));
        orders.add(new Order("71hj", "Cunt"));
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("71hj"), is(new Order("71hj", "Cunt")));
    }
}