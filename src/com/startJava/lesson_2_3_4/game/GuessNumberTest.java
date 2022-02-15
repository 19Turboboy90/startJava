package com.startJava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String option = "yes";
        System.out.println("Игра начинается!!! У каждого игрока по 10 попыток");
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        while (!option.equals("no")) {
            if (option.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            option = console.nextLine();
        }
    }
}