package com.company.utils;

import com.company.model.Book;

import java.util.ArrayList;

public class CatalogManager {

    public static void lookBooks(ArrayList<Book> books) {
        int page = 1;
        boolean isExit = false;
        final int booksOnPage = 3;

        int pages = books.size() / booksOnPage;

        pages = (books.size() % booksOnPage == 0) ? pages : pages + 1;

        while (!isExit) {
            System.out.println("\nPage " + page + " from " + pages + ":");

            for (int i = page * booksOnPage - booksOnPage; i < page * booksOnPage && i < books.size(); i++) {
                System.out.println(books.get(i));
            }

            System.out.println("\nEnter page number or [0] to go back:");
            page = InputManager.inputInteger();

            if (page == 0) {
                isExit = true;
            } else if (page < 0 || page > pages) {
                System.out.println("\nThere is no such page.");
                page = 1;
            }
        }
    }

    public static void addBook(ArrayList<Book> books) {
        System.out.println("\nEnter title: ");
        String title = InputManager.inputStringLine();

        System.out.println("\nEnter author: ");
        String author = InputManager.inputStringLine();

        System.out.println("\nEnter genre: ");
        String genre = InputManager.inputStringLine();

        System.out.println("\nEnter year: ");
        int year = InputManager.inputYear();

        System.out.println("\nBook type\n[1] Paper book\t[2] Electronic book");
        int choice = InputManager.inputInteger();

        BookType type;

        switch (choice) {
            case 1:
                type = BookType.PAPERBOOK;
                break;
            case 2:
                type = BookType.EBOOK;
                break;
            default:
                type = BookType.NONE;
        }

        Book book = new Book(title, author, genre, year, type);

        books.add(book);
        FileManager.writeBookData(book);
    }

    public static ArrayList<Book> searchBooksByTitle(ArrayList<Book> books, String title) {
        ArrayList<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }

        return result;
    }

    public static ArrayList<Book> searchBooksByAuthor(ArrayList<Book> books, String author) {
        ArrayList<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }

        return result;
    }

    public static ArrayList<Book> searchBooksByGenre(ArrayList<Book> books, String genre) {
        ArrayList<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                result.add(book);
            }
        }

        return result;
    }

    public static void deleteBook(ArrayList<Book> books, Book book) {
        books.remove(book);
    }
}
