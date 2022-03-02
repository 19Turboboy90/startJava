package com.startJava.bookshelf;

import java.util.Scanner;

public class BookTest {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        String option = "да";
        while (!option.equals("нет")) {
            if (option.equals("да")) {
                System.out.println("""
                        Меню:
                         1 - добавить новую книгу
                         2 - удалить книгу
                         3 - найти книгу
                         4 - количество всех книг
                         5 - количество свободного места
                        """);
                System.out.print("Введите цифру: ");
                dataEntry(bookshelf, console.nextInt());
            }
            System.out.print("Хотите продолжить? [да/нет]: ");
            option = console.next();
        }
    }

    private static void dataEntry(Bookshelf bookshelf, int itemMenu) {
        console.nextLine();
        switch (itemMenu) {
            case 1 -> {
                System.out.print("Введите автора книги: ");
                String author = console.nextLine();
                System.out.print("Введите название книги: ");
                String name = console.nextLine();
                System.out.print("Введите дату издание книги: ");
                int year = console.nextInt();
                bookshelf.addBook(new Book(author, name, year));
            }
            case 2 -> {
                System.out.print("Введите название книги: ");
                String bookRemove = console.nextLine();
                System.out.println(bookshelf.removeBook(bookRemove) ? "Книга удалена!" : "Книга не удалена, данной книги нет в списке!");
            }
            case 3 -> {
                System.out.print("Введите название книги: ");
                String bookName = console.nextLine();
                System.out.println(bookshelf.getBook(bookName) != null ? bookshelf.getBook(bookName) : "Данная книга не найдена!");
            }
            case 4 -> System.out.println("Количество книг на полке: " + bookshelf.getCountBooks());
            case 5 -> System.out.println("Количество свободного места на полке: " + bookshelf.getCountFreeCells());
            default -> System.out.println("Введено число не из списка меню");
        }
        bookshelf.drawShelf();
    }
}
