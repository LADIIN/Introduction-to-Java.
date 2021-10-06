package com.company;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “

public class Main {

    public static void main(String[] args) {
        System.out.println(createCakeFromWord("информатика"));
    }

    private static String createCakeFromWord(String word) {
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += String.valueOf(word.charAt(word.indexOf('т')));

        return cake;
    }
}
