package com.startJava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, countAttempts);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void addNumber(int number) {
        enteredNumbers[countAttempts] = number;
        countAttempts++;
    }

    public void resetNumbers() {
        Arrays.fill(enteredNumbers, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public int lastEnterNumber() {
        int lastEnterNumber = 0;
        int enteredNumber = 0;
        for (int i = lastEnterNumber; i < enteredNumbers.length; i++) {
            lastEnterNumber++;
            if (lastEnterNumber == countAttempts) {
                enteredNumber = enteredNumbers[i];
                break;
            }
        }

        return enteredNumber;

    }
}