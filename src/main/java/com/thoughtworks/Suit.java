package com.thoughtworks;

public enum Suit {
    SPADE("黑桃"),
    HEART("红桃"),
    CLUB("梅花"),
    DIAMOND("方片"),
    ;
    private String name;

    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
