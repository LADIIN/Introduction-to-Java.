package com.company;

//Из заданной строки получить новую, повторив каждый символ дважды.

public class Main {

    public static void main(String[] args) {
        String text = "Hello there!";
        System.out.println(repeatCharacter(text,2));
    }

    private static String repeatCharacter(String line, int number) {
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < number; j++) {
                strBuilder.append(line.charAt(i));
            }
        }
        return strBuilder.toString();
    }
}
