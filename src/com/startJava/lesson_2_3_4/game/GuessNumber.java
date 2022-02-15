package com.startJava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Scanner console = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int guessNumber = (int) (Math.random() * 100 + 1);
        while (true) {
            enterNumber(player1);
            if (compareNumbers(guessNumber, player1)) {
                break;
            }
            enterNumber(player2);
            if (compareNumbers(guessNumber, player2)) {
                break;
            }
            if (player2.getEnteredNumbers().length == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                System.out.println("У " + player2.getName() + " закончились попытки");
                break;
            }
        }
        displayAttempts(player1);
        displayAttempts(player2);
        player1.resetNumbers();
        player2.resetNumbers();
    }

    private void displayAttempts(Player player) {
        int[] numbers = player.getEnteredNumbers();
        System.out.print("Введенные числа игрока " + player.getName() + ":");
        for (int number : numbers) {
            System.out.print(" " + number);
        }
        System.out.println();
    }

    private boolean compareNumbers(int guessNumber, Player player) {
        if (guessNumber == player.lastEnterNumber()) {
            System.out.println("Игрок: " + player.getName() + " победил!!! Угадав число " + guessNumber + " с " + player.getCountAttempts() + " попытки");
            return true;
        } else if (guessNumber > player.lastEnterNumber()) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else System.out.println("Данное число больше того, что загадал компьютер");
        return false;
    }

    private void enterNumber(Player player) {
        System.out.print("Игрок " + player.getName() + " вводит число: ");
        player.addNumber(console.nextInt());
    }
}