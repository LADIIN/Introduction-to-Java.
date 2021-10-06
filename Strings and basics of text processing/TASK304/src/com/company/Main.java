package com.company;

//В строке найти количество чисел

public class Main {

    public static void main(String[] args) {
        String text = "I have two number 9, number 9 large," +
                " number 6 with extra dip,number 7," +
                " two number 45, one with cheese and a large soda.";

        System.out.println(text + "\nNumbers: " + countNumbers(text));
    }

    private static int countNumbers(String text) {
        int amount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                if (i == text.length() - 1 || !Character.isDigit(text.charAt(i + 1))) {
                    amount++;
                }
            }
        }
        return amount;
    }

}
