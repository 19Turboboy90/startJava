package com.startJava.lesson_2_3_4.bookshelf;

public class Book {
    private String author;
    private String nameBook;
    private int yearOfPublication;

    public Book(String author, String nameBook, int yearOfPublication) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public String toString() {
        return "Автор = '" + author + '\'' + ", Название книги = '" + nameBook + '\'' + ", Год издания = " + yearOfPublication;
    }
}
