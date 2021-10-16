package com.company.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputManager {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputStringLine() {
        scanner.useDelimiter("[\r\n]");

        String line = scanner.nextLine();

        while (line.isEmpty() || line.length() > 30) {
            System.out.println("\nError: Input Error. Try again:");
            line = scanner.nextLine();
        }

        return line.trim();
    }

    public static String inputLogin() {
        Pattern pattern = Pattern.compile("[\\D\\w ]{4,30}");
        scanner.useDelimiter("[\r\n]");
        String login = scanner.nextLine();

        while (!login.matches("[\\D\\w ]{4,30}") || !UserManager.isLoginUnique(login)) {
            System.out.println("\nError: Input Error or login is already taken. Try again:");
            login = scanner.nextLine();
        }

        return login;
    }

    public static String inputEmail() {
        scanner.useDelimiter("[\r\n]");

        String email = scanner.nextLine();

        while (!email.matches("^[a-z_]{2,20}@[a-z]{2,9}\\.[a-z]{2,3}$")) {
            System.out.println("\nError: Invalid email address. Try again:");
            email = scanner.nextLine();
        }

        return email;
    }

    public static int inputInteger() {
        Pattern pattern = Pattern.compile("[\\d]");

        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("\nError: Input error. Try again:");
        }

        int integer = scanner.nextInt();
        scanner.nextLine();

        return integer;
    }

    public static int inputYear() {
        Pattern pattern = Pattern.compile("[+\\d ]{4}");

        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("\nError: Input error. Try again:");
        }

        int integer = scanner.nextInt();
        scanner.nextLine();

        return integer;

    }
}
