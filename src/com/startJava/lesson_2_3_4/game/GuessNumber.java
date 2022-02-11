package com.startJava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    Scanner console = new Scanner(System.in);

    public void start() {
        int guessNumber = (int) (Math.random() * 100 + 1);
        while (true) {
            int number1 = enterNumber(player1);
            if (compareNumbers(guessNumber, number1)) {
                break;
            }

            int number2 = enterNumber(player2);
            if (compareNumbers(guessNumber, number2)) {
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

    private boolean compareNumbers(int guessNumber, int number) {
        if (guessNumber == number) {
            System.out.println("Игрок: " + player1.getName() + " победил!!! Угадав число " + guessNumber + " с " + player1.getCountAttempts() + " попытки");
            return true;
        } else if (guessNumber > number) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Данное число больше того, что загадал компьютер");
        }
        return false;
    }

    private int enterNumber(Player player) {
        System.out.print("Игрок " + player.getName() + " вводит число: ");
        int number = console.nextInt();
        player.addNumber(number);
        return number;
    }
}