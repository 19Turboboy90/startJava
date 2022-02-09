package com.startJava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner console = new Scanner(System.in);
        int guessNumber = (int) (Math.random() * 100 + 1);
        while (true) {
            System.out.print("Игрок " + player1.getName() + " вводит число: ");
            int number1 = (console.nextInt());
            player1.addNumber(number1);
            if (guessNumber == number1) {
                System.out.println("Игрок: " + player1.getName() + " победил!!! Угадав число " + guessNumber + " с " + player1.getCountAttempts() + " попытки");
                break;
            }
            checkingInputNumbers(guessNumber, number1);

            System.out.print("Игрок " + player2.getName() + " вводит число: ");
            int number2 = (console.nextInt());
            player2.addNumber(number2);
            if (guessNumber == number2) {
                System.out.println("Игрок: " + player2.getName() + " победил!!! Угадав число " + guessNumber + " с " + player2.getCountAttempts() + " попытки");
                break;
            }
            checkingInputNumbers(guessNumber, number2);

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
        int[] array = player.getEnteredNumbers();
        System.out.print("Введенные числа игрока " + player.getName() + ":");
        for (int number : array) {
            System.out.print(" " + number);
        }
        System.out.println();
    }

    private void checkingInputNumbers(int guessNumber, int number) {
        if (guessNumber > number) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Данное число больше того, что загадал компьютер");
        }
    }
}