package com.startJava.bookshelf;

public class Bookshelf {
    private int size;
    private final Book[] books = new Book[10];

    public void addBook(Book book) {
        books[size] = book;
        size++;
    }

    public boolean removeBook(String nameBook) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(nameBook)) {
                System.arraycopy(books, i + 1, books, i, size - i);
                size--;
                return true;
            }
        }
        return false;
    }

    public Book getBook(String nameBook) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(nameBook)) {
                return books[i];
            }
        }
        return null;
    }

    public int getCountBooks() {
        return size;
    }

    public int getCountFreeCells() {
        return books.length - size;
    }

    public void drawShelf() {
        for (Book book : books) {
            if (book == null) {
                System.out.println("<!--  --!>");
            } else {
                System.out.println("<!-- " + book + " --!>");
            }
        }
    }
}