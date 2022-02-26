package com.startJava.bookshelf;

import java.util.Scanner;

public class BookTest {
    static Scanner console = new Scanner(System.in);
    static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        String option = "да";
        System.out.println("""
                Меню:
                 1 - добавить новую книгу
                 2 - удалить книгу
                 3 - найти книгу
                 4 - колличество всех книг
                 5 - колличество свободного места
                """);

        while (!option.equals("нет")) {
            if (option.equals("да")) {
                System.out.print("Введите цифру: ");
                menu(console.nextInt());
                bookshelf.shelf();
            }
            System.out.print("Хотите продолжить? [да/нет]: ");
            option = console.next();
        }
    }

    private static void menu(int itemMenu) {
        switch (itemMenu) {
            case 1 -> {
                System.out.print("Введите автора книги: ");
                console.nextLine();
                String authorAdd = console.nextLine();
                System.out.print("Введите названиме книги: ");
                String nameAdd = console.nextLine();
                System.out.print("Введите дату издание книги: ");
                int yearAdd = console.nextInt();
                bookshelf.addBook(new Book(authorAdd, nameAdd, yearAdd));
            }
            case 2 -> {
                console.nextLine();
                System.out.print("Введите названиме книги: ");
                bookshelf.removeBook(console.nextLine());
            }
            case 3 -> {
                System.out.print("Введите название книги: ");
                console.nextLine();
                String getBook = console.nextLine();
                System.out.println(bookshelf.getBook(getBook));
            }
            case 4 -> System.out.println("Колличество книг на полке: " + bookshelf.quantityBooks());
            case 5 -> System.out.println("Колличество свободного места на полке: " + bookshelf.quantityFree());
            default -> System.out.println("Введено число не из списка меню");
        }
    }
}
