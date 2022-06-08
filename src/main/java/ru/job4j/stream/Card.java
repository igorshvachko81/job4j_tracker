package ru.job4j.stream;

public class Card {
    private Suit suit;
    private Value value;

    Card(Suit s, Value v) {
        suit = s;
        value = v;
    }

    @Override
    public String toString() {
        return "[" + value + suit + "]";
    }
}
