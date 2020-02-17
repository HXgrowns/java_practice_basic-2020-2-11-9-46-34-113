package com.thoughtworks;

public class Card {
    private Suit suit;
    private PointNumber pointNumber;

//    static {
//        if (cards == null) {
//            cards = new ArrayList<>();
//            for (Suit suit : Suit.values()) {
//                for (PointNumber point : PointNumber.values()) {
//                    Card card = new Card(suit, point);
//                    cards.add(card);
//                }
//            }
//        }
//    }

    public Card(Suit suit, PointNumber pointNumber) {
        this.suit = suit;
        this.pointNumber = pointNumber;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return String.format("%s%s", this.suit.getName(), this.pointNumber.getName());
    }
}
