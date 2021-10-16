package com.company.model;

import com.company.utils.FileManager;

import java.util.ArrayList;

public class Catalog {
    private static final ArrayList<Book> books = FileManager.readBooksData();

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static Book getBook(String title, String author) {
        for (Book book : getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }
}
