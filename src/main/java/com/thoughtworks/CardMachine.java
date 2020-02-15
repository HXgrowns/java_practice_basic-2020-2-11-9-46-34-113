package com.thoughtworks;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class CardMachine {
    public void drawCard(int n) {
        if (n > Card.cards.size()) {
            System.out.println("输入超过扑克的总数");
            return;
        }

        Set<Integer> indexes = new LinkedHashSet<>();
        Random random = new Random();
        while (indexes.size() < n) {
            int index = random.nextInt(Card.cards.size());
            indexes.add(index);
        }
        for (Integer index : indexes) {
            Card card = Card.cards.get(index);
            System.out.print(card + " ");
        }
        System.out.println();
    }
}
