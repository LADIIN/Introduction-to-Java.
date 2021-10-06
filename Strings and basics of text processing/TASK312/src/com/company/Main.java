package com.company;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        System.out.println(text);
        System.out.println("Result: " + removeReplayingLetters(text));
    }

    private static String removeReplayingLetters(String text) {
        StringBuilder strBuilder = new StringBuilder(text);

        for (int i = 0; i < strBuilder.length(); i++) {

            if (strBuilder.charAt(i) == ' ') {
                strBuilder.deleteCharAt(i);
                i--;

            } else {
                for (int j = i + 1; j < strBuilder.length(); j++) {

                    if (strBuilder.charAt(i) == strBuilder.charAt(j)) {
                        strBuilder.deleteCharAt(j);
                    }
                }
            }

        }

        return strBuilder.toString();
    }

}
