package com.startJava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String checkingResponse = "yes";
        System.out.println("Игра начинается!!! У каждого игрока по 10 попыток");
        System.out.print("Введите имя первого игрока: ");
        String name1 = console.nextLine();
        Player player1 = new Player(name1);
        System.out.print("Введите имя второго игрока: ");
        String name2 = console.nextLine();
        Player player2 = new Player(name2);
        GuessNumber game = new GuessNumber(player1, player2);
        while (!checkingResponse.equals("no")) {
            if (checkingResponse.equals("yes")) {
                game.startGame();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            checkingResponse = console.next();
            game.resetValues();
        }
    }
}