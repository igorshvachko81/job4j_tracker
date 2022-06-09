package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CardDeck {
    public static void main(String[] args) {
        List<Card> cardList = Stream.of(Value.values())
                .flatMap(v -> Stream.of(Suit.values())
                        .map(s -> new Card(s, v)))
                .collect(Collectors.toList());
        System.out.println(cardList);
    }
}