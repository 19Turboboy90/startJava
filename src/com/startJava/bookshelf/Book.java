package com.startJava.bookshelf;

public class Book {
    private String author;
    private String title;
    private int yearOfPublication;

    public Book(String author, String nameBook, int yearOfPublication) {
        this.author = author;
        this.title = nameBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Автор = '" + author + '\'' + ", Название книги = '" + title + '\'' + ", Год издания = " + yearOfPublication;
    }
}
