package com.company;

//Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.

public class Main {

    public static void main(String[] args) {
        String text = "First sentence, but im not sure. Second sentence! Third sentence?";

        System.out.println("Number of sentences: " + countSentences(text));

    }

    private static int countSentences(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') {
                counter++;
            }
        }
        return counter;
    }

}
