package com.company.utils;

import com.company.model.Book;
import com.company.model.User;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    public static ArrayList<Book> readBooksData() {
        ArrayList<Book> books = new ArrayList<>();
        int year = -1;
        BookType type;

        try {
            File file = new File("src/com/company/data/books.txt");
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split(" - ");

                if (fields[3].matches("(?<![-.])\\b[0-9]+\\b(?!\\.[0-9])")) {
                    year = Integer.parseInt(fields[3]);
                }

                if (fields[4].equals("Paper book")) {
                    type = BookType.PAPERBOOK;
                } else if (fields[4].equals("Electronic book")) {
                    type = BookType.EBOOK;
                } else {
                    type = BookType.NONE;
                }

                books.add(new Book(fields[0], fields[1], fields[2], year, type));
            }

            fileReader.close();

        } catch (IOException exception) {
            System.out.println("\nError: Cant find file.");
        }

        return books;
    }

    public static void writeBookData(Book book) {
        try (FileWriter writer = new FileWriter("src/com/company/data/books.txt", true)) {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(book.getTitle()).append(" - ");
            stringBuilder.append(book.getAuthor()).append(" - ");
            stringBuilder.append(book.getGenre()).append(" - ");
            stringBuilder.append(book.getYear()).append(" - ");
            stringBuilder.append(book.getType()).append("\n");

            writer.write(stringBuilder.toString());

            writer.flush();

        } catch (IOException ex) {
            System.out.println("\nError: Input file error.");
        }
    }

    public static void rewriteBooksData(ArrayList<Book> books) {
        try (FileWriter writer = new FileWriter("src/com/company/data/books.txt", false)) {
            StringBuilder stringBuilder = new StringBuilder();

            for (Book book: books) {
                stringBuilder.append(book.getTitle()).append(" - ");
                stringBuilder.append(book.getAuthor()).append(" - ");
                stringBuilder.append(book.getGenre()).append(" - ");
                stringBuilder.append(book.getYear()).append(" - ");
                stringBuilder.append(book.getType()).append("\n");
            }

            writer.write(stringBuilder.toString());

            writer.flush();

        } catch (IOException ex) {
            System.out.println("\nError: Input file error.");
        }
    }

    public static ArrayList<User> readUsersData() {
        ArrayList<User> users = new ArrayList<>();
        AccessLevel accessLevel;

        try {
            File file = new File("src/com/company/data/users.txt");
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split(" - ");

                if (fields[4].equals("ADMIN")) {
                    accessLevel = AccessLevel.ADMIN;
                } else {
                    accessLevel = AccessLevel.USER;
                }

                users.add(new User(fields[0], fields[1], fields[2], fields[3], accessLevel));

            }

            fileReader.close();

        } catch (IOException exception) {
            System.out.println("\nError: Cant find file.");
        }
        return users;
    }

    public static void writeUserData(User user) {
        try (FileWriter writer = new FileWriter("src/com/company/data/users.txt", true)) {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(user.getUsername()).append(" - ");
            stringBuilder.append(user.getLogin()).append(" - ");
            stringBuilder.append(PasswordManager.md5Custom(user.getPassword())).append(" - ");
            stringBuilder.append(user.getEmail()).append(" - ");
            stringBuilder.append(user.getAccessLevel()).append("\n");

            writer.write(stringBuilder.toString());

            writer.flush();

        } catch (IOException ex) {
            System.out.println("\nError: Input file error.");
        }
    }


}
