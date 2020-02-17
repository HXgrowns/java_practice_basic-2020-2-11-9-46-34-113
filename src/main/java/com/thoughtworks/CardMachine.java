package com.thoughtworks;

import java.util.*;

public class CardMachine {

    public List<Card> getCards() {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (PointNumber point : PointNumber.values()) {
                Card card = new Card(suit, point);
                cards.add(card);
            }
        }
        return cards;
    }

    public void drawCard(int n) {
        List<Card> cards = getCards();
        if (n < 0 || n > cards.size()) {
            System.out.println("输入错误");
            return;
        }

        Set<Integer> indexes = new LinkedHashSet<>();
        Random random = new Random();
        while (indexes.size() < n) {
            int index = random.nextInt(cards.size());
            indexes.add(index);
        }
        for (Integer index : indexes) {
            Card card = cards.get(index);
            System.out.print(card + " ");
        }
        System.out.println();
    }
}
