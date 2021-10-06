package com.company;

//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
//буквы.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        System.out.println("Number of uppercase letters: " + countUpperCaseLetters(text)
                + "\nNumber of lowercase letters: " + countLowerCaseLetters(text));
    }

    private static int countUpperCaseLetters(String text) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                counter++;
            }
        }

        return counter;
    }

    private static int countLowerCaseLetters(String text) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                counter++;
            }
        }

        return counter;
    }
}
