package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CardDeck {
    public static void main(String[] args) {
        Suit[] suits = {Suit.Diamonds, Suit.Hearts, Suit.Spades, Suit.Clubs};
        Value[] values = {Value.V_6, Value.V_7, Value.V_8};
        List<Card> cardList = Stream.of(values)
                .flatMap(v -> Stream.of(suits)
                        .map(s -> new Card(s, v)))
                .collect(Collectors.toList());
        System.out.println(cardList);
    }
}
