package com.company.model;

import com.company.utils.BookType;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int year;
    private BookType type;

    public Book(String title, String author, String genre, int year, BookType type) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("\nTitle:\t%s\nAuthor:\t%s\nGenre:\t%s\nYear:\t%d\nType:\t%s\n",
                this.getTitle(), this.getAuthor(), this.getGenre(), this.getYear(), this.getType());
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BookType getType() {
        return this.type;
    }

    public void setType(BookType type) {
        this.type = type;
    }
}
