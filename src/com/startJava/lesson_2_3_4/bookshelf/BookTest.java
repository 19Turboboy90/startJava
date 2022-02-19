package com.startJava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        String option = "да";
        System.out.println("""
                Меню:
                 1 - для добавления новой книги,
                 2 - удаление выбранной книги,
                 3 - поиск выбранной книги,
                 4 - колличество всех книг,
                 5 - колличество свободного месат.
                """);

        while (!option.equals("нет")) {
            if (option.equals("да")) {
                System.out.print("Введите цифру: ");
                int itemMenu = console.nextInt();
                console.nextLine();
                bookshelf.menu(itemMenu);
                bookshelf.shelf();
            }
            System.out.print("Хотите продолжить? [да/нет]: ");
            option = console.next();
        }
    }
}
