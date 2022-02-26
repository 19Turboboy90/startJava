package com.startJava.bookshelf;

public class Bookshelf {
    private int size;
    private final Book[] books = new Book[10];

    void addBook(Book book) {
        books[size] = book;
        size++;
    }

    void removeBook(String nameBook) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(nameBook)) {
                System.arraycopy(books, i + 1, books, i, size);
                size--;
                break;
            }
        }
    }

    Book getBook(String nameBook) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(nameBook)) {
                return books[i];
            }
        }
        return null;
    }

    int quantityBooks() {
        return size;
    }

    int quantityFree() {
        return books.length - size;
    }

    public void shelf() {
        for (Book book : books) {
            if (book == null) {
                System.out.println("<!--  --!>");
            } else {
                System.out.println("<!-- " + book + " --!>");
            }
        }
    }
}