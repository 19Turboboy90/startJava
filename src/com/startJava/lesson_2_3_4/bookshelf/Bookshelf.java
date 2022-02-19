package com.startJava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class Bookshelf {
    private int size;
    private final Book[] books = new Book[10];
    Scanner console = new Scanner(System.in);

    private void addBook(Book book) {
        books[size] = book;
        size++;
    }

    private void removeBook(String nameBook) {
        for (int i = 0; i < size; i++) {
            if (books[i].getNameBook().equals(nameBook)) {
                System.arraycopy(books, i + 1, books, i, books.length - i - 1);
                size--;
                break;
            }
        }
    }

    private Book getBook(String nameBook) {
        Book searchBook = new Book(" ", " ", 0);
        for (int i = 0; i < size; i++) {
            if (books[i].getNameBook().equals(nameBook)) {
                searchBook = books[i];
            }
        }
        return searchBook;
    }

    private int quantityBooks() {
        return size;
    }

    private int quantityFree() {
        int count = 0;
        for (Book book : books) {
            if (book == null) {
                count++;
            }
        }
        return count;
    }

    public void shelf() {
        for (Book book : books) {
            System.out.println("<!--" + book + "--!>");
        }
    }

    public void menu(int itemMenu) {
        switch (itemMenu) {
            case 1 -> {
                System.out.print("Введите автора книги: ");
                String authorAdd = console.nextLine();
                System.out.print("Введите названиме книги: ");
                String nameAdd = console.nextLine();
                System.out.print("Введите дату издание книги: ");
                int yearAdd = console.nextInt();
                console.nextLine();
                addBook(new Book(authorAdd, nameAdd, yearAdd));
            }
            case 2 -> {
                System.out.print("Введите названиме книги: ");
                removeBook(console.nextLine());
            }
            case 3 -> {
                System.out.print("Введите название книги: ");
                String getBook = console.nextLine();
                System.out.println(getBook(getBook));
            }
            case 4 -> System.out.println("Колличество книг на полке: " + quantityBooks());
            case 5 -> System.out.println("Колличество свободного места на полке: " + quantityFree());
            default -> System.out.println("Введено число не из списка меню");
        }
    }
}