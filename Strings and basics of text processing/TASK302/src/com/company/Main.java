package com.company;

//Замените в строке все вхождения 'word' на 'letter'.

public class Main {

    public static void main(String[] args) {
        String text = "There is so lot of words in his speech!";
        System.out.println(text);
        System.out.println(replaceWordByLetter(text));
    }

    private static String replaceWordByLetter(String text) {
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i + 3 < text.length()
                    && text.charAt(i) == 'w'
                    && text.charAt(i + 1) == 'o'
                    && text.charAt(i + 2) == 'r'
                    && text.charAt(i + 3) == 'd') {
                strBuilder.append("letter");
                i += 3;
            } else {
                strBuilder.append(text.charAt(i));
            }
        }

        return strBuilder.toString();
    }

}
