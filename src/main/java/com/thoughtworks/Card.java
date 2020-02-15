package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class Card {
    public static List<Card> cards;
    private Suit suit;
    private PointNum pointNum;

    static {
        if (cards == null) {
            cards = new ArrayList<>();
            for (Suit suit : Suit.values()) {
                for (PointNum point : PointNum.values()) {
                    Card card = new Card(suit, point);
                    cards.add(card);
                }
            }
        }
    }

    private Card(Suit suit, PointNum pointNum) {
        this.suit = suit;
        this.pointNum = pointNum;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return String.format("%s%s", this.suit.name, this.pointNum.name);
    }

    enum Suit {
        SPADE("黑桃"),
        HEART("红桃"),
        CLUB("梅花"),
        DIAMOND("方片"),
        ;

        private String name;

        Suit(String name) {
            this.name = name;
        }
    }

    enum PointNum {
        A("A"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        J("J"),
        Q("Q"),
        K("K"),
        ;
        private String name;

        PointNum(String name) {
            this.name = name;
        }
    }
}
