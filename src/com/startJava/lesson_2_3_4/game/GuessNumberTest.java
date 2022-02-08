package com.startJava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String checkingResponse = "yes";
        System.out.println("Игра начинается!!! У каждого игрока по 10 попыток");
        System.out.print("Введите имя первого игрока: ");
        Player name1 = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player name2 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(name1, name2);
        while (!checkingResponse.equals("no")) {
            if (checkingResponse.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            checkingResponse = console.nextLine();
        }
    }
}