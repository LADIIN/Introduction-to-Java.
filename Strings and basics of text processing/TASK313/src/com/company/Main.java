package com.company;

//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        System.out.println(text + "\nLongest word:\n" + findLongestWord(text));
    }

    private static String findLongestWord(String text) {
        String[] words = text.split(" ");
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

}
