package com.startJava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];
    private int countPlayer = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, countPlayer);
    }

    public int getCountPlayer() {
        return countPlayer;
    }

    public void added(int number) {
        enteredNumbers[countPlayer] = number;
        countPlayer++;
    }

    public void resetValues() {
        Arrays.fill(getEnteredNumbers(), 0, getCountPlayer(), 0);
        countPlayer = 0;
    }
}