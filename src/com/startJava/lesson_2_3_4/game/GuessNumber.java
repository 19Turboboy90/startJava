package com.startJava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    int countPlayer1;
    int countPlayer2;
    int[] newEnteredNumbers1;
    int[] newEnteredNumbers2;

    public void startGame() {
        Scanner console = new Scanner(System.in);
        int guessNumber = (int) (Math.random() * 100 + 1);
        newEnteredNumbers1 = player1.getEnteredNumbers();
        newEnteredNumbers2 = player2.getEnteredNumbers();
        while (true) {
            if (newEnteredNumbers1.length != countPlayer1) {
                System.out.print("Игрок " + player1.getName() + " вводит число: ");
                int number1 = (console.nextInt());
                newEnteredNumbers1[countPlayer1] = number1;
                countPlayer1++;
                if (guessNumber == number1) {
                    System.out.println("Игрок: " + player1.getName() + " победил!!! Угадав число " + guessNumber + " с " + countPlayer1 + " попытки");
                    break;
                } else if (guessNumber > number1) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Данное число больше того, что загадал компьютер");
                }
            } else {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }

            if (newEnteredNumbers2.length != countPlayer2) {
                System.out.print("Игрок " + player2.getName() + " вводит число: ");
                int number2 = (console.nextInt());
                newEnteredNumbers2[countPlayer2] = number2;
                countPlayer2++;
                if (guessNumber == number2) {
                    System.out.println("Игрок: " + player2.getName() + " победил!!! Угадав число " + guessNumber + " с " + countPlayer2 + " попытки");
                    break;
                } else if (guessNumber > number2) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Данное число больше того, что загадал компьютер");
                }
            } else System.out.println("У " + player2.getName() + " закончились попытки");
        }
        int[] newArray1 = Arrays.copyOf(newEnteredNumbers1, countPlayer1);
        int[] newArray2 = Arrays.copyOf(newEnteredNumbers2, countPlayer2);
        System.out.println("Введенные числа игрока " + player1.getName() + Arrays.toString(newArray1));
        System.out.println("Введенные числа игрока " + player2.getName() + Arrays.toString(newArray2));
    }

    public void resetValues() {
        Arrays.fill(newEnteredNumbers1, 0, countPlayer1, 0);
        Arrays.fill(newEnteredNumbers2, 0, countPlayer2, 0);
        countPlayer1 = 0;
        countPlayer2 = 0;
    }
}