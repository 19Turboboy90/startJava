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
            if (player1.getCountPlayer() != 10) {
                System.out.print("Игрок " + player1.getName() + " вводит число: ");
                int number1 = (console.nextInt());
                player1.added(number1);
                if (guessNumber == number1) {
                    System.out.println("Игрок: " + player1.getName() + " победил!!! Угадав число " + guessNumber + " с " + player1.getCountPlayer() + " попытки");
                    break;
                } else if (guessNumber > number1) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Данное число больше того, что загадал компьютер");
                }
            } else {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }

            if (player2.getCountPlayer() != 10) {
                System.out.print("Игрок " + player2.getName() + " вводит число: ");
                int number2 = (console.nextInt());
                player2.added(number2);
                if (guessNumber == number2) {
                    System.out.println("Игрок: " + player2.getName() + " победил!!! Угадав число " + guessNumber + " с " + player2.getCountPlayer() + " попытки");
                    break;
                } else if (guessNumber > number2) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Данное число больше того, что загадал компьютер");
                }
            } else {
                System.out.println("У " + player2.getName() + " закончились попытки");
                break;
            }
        }
        sorted(player1.getEnteredNumbers(), player1);
        sorted(player2.getEnteredNumbers(), player2);
        player1.resetValues();
        player2.resetValues();
    }

    private void sorted(int[] array, Player player) {
        System.out.print("Введенные числа игрока " + player.getName() + ":");
        for (int number : array) {
            System.out.print(" " + number);
        }
        System.out.println();
    }
}