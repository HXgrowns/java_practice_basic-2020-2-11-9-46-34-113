package com.thoughtworks;

public enum PointNumber {
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

    PointNumber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
