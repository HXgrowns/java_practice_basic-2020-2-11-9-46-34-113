package com.thoughtworks;

import java.util.Scanner;

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
