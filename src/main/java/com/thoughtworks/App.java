package com.thoughtworks;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            CardMachine cardMachine = new CardMachine();
            cardMachine.drawCard(n);
        }
    }
}
