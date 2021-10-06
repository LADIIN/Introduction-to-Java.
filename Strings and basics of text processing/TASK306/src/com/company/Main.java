package com.company;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем

public class Main {

    public static void main(String[] args) {
        String text = "Trying    to find            longest   space line.   ";

        System.out.println(text + "\nResult: " + findLongestSpaceLine(text));
    }

    private static int findLongestSpaceLine(String text) {
        int maxLength = 0;
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                counter++;
            } else {
                if (counter > maxLength) {
                    maxLength = counter;
                }
                counter = 0;
            }
        }
        return maxLength;
    }
}
