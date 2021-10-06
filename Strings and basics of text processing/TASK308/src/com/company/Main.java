package com.company;

//Проверить, является ли заданное слово палиндромом.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scanner.next();

        System.out.println("Is palindrome: " + isPalindrome(word));

    }

    private static boolean isPalindrome(String word) {
        StringBuilder strBuilder = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            strBuilder.append(word.charAt(i));
        }

        return word.equalsIgnoreCase(strBuilder.toString());
    }

}
