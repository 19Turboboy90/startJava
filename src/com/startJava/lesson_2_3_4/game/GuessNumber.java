package com.startJava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Scanner console = new Scanner(System.in);
        int guessNumber = (int) (Math.random() * 100 + 1);
        while (true) {
            System.out.print("Игрок " + player1.getName() + " вводит число: ");
            player1.setNumber(console.nextInt());
            if (guessNumber == player1.getNumber()) {
                System.out.println("Игрок: " + player1.getName() + " победил!!! Угадав число " + guessNumber);
                break;
            } else if (guessNumber > player1.getNumber()) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
            
            System.out.print("Игрок " + player2.getName() + " вводит число: ");
            player2.setNumber(console.nextInt());
            if (guessNumber == player2.getNumber()) {
                System.out.println("Игрок: " + player1.getName() + " победил!!! Угадав число " + guessNumber);
                break;
            } else if (guessNumber > player2.getNumber()) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        }
    }
}