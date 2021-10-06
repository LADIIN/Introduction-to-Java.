package com.company;

/*
Cоздать  приложение,  разбирающее  текст  (текст  хранится  в  строке)  и  позволяющее
        выполнять  с  текстом  три  различных операции:
        отсортировать  абзацы  по  количеству  предложений;
        в  каждом  предложении  отсортировать  слова  по  длине;
        отсортировать лексемы в предложении  по убыванию количества вхождений заданного символа,
        а в случае равенства – по алфавиту.
*/

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = """
                Did you ever hear the tragedy of Darth Plagueis The Wise?I thought not. It’s not a story the Jedi
                would tell you.
                It’s a Sith legend. Darth Plagueis was a Dark Lord of the Sith,
                so powerful and so wise he could use the Force to influence the midichlorians to create life…
                He had such a knowledge of the dark side that he could even keep the ones he cared about from dying.
                The dark side of the Force is a pathway to many abilities some consider to be unnatural.
                He became so powerful… the only thing he was afraid of was losing his power, which eventually, of course, he did.
                Unfortunately, he taught his apprentice everything he knew, then his apprentice killed him in his sleep.
                Ironic. He could save others from death, but not himself.""";

        System.out.println("\nSorted paragraphs:\n" + sortParagraphs(text));
        System.out.println("\nSorted words in sequences by length:\n" + sortWordsInSequences(text));
        System.out.println("\nSort lexemes:\n" + sortLexemes(text, "a"));
    }

    public static String sortLexemes(String text, String letter) {
        StringBuilder strBuilder = new StringBuilder();
        StringBuilder result = new StringBuilder();
        String temp;
        String[] words;
        String[] sequences = text.split("\\.*[.!?]\\s*");

        for (String sequence : sequences) {
            words = sequence.split("[\\p{Punct}\\s]+");

            Pattern pattern = Pattern.compile("(\\w*)?[" + letter + "](\\w*)");

            Matcher matcher = pattern.matcher(sequence);

            while (matcher.find()) {
                strBuilder.append(matcher.group()).append(" ");
            }

            words = strBuilder.toString().split(" ");

            for (int i = 0; i < words.length - 1; i++) {
                for (int j = 0; j < words.length - i - 1; j++) {
                    if (countLetter(words[j], letter) < countLetter(words[j + 1], letter)) {
                        temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                    }
                }
            }
            result.append(Arrays.toString(words)).append("\n");
        }
        return result.toString();
    }

    public static int countLetter(String word, String letter) {
        Pattern pattern = Pattern.compile("[" + letter + "]");
        Matcher matcher = pattern.matcher(word);

        int counter = 0;

        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

    public static int countSequences(String text) {
        int counter = 0;

        Pattern pattern = Pattern.compile("[^!?.]+");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

    public static String sortWordsInSequences(String text) {
        String[] sequences = text.split("\\.*[.!?]\\s*");
        String temp;
        String[] words;
        StringBuilder strBuilder = new StringBuilder();

        for (String sequence : sequences) {
            words = sequence.split("[\\p{Punct}\\s]+");

            for (int i = 0; i < words.length - 1; i++)
                for (int j = 0; j < words.length - i - 1; j++)
                    if (words[j].length() < words[j + 1].length()) {
                        temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                    }
            strBuilder.append(Arrays.toString(words)).append("\n");

        }

        return strBuilder.toString();
    }

    public static String sortParagraphs(String text) {
        String[] array = text.split("\\r?\\n");
        String temp;

        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (countSequences(array[j]) < countSequences(array[j + 1])) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

        return convertToString(array);
    }

    public static String convertToString(String[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String element : array) {
            stringBuilder.append(element).append("\n");
        }

        return stringBuilder.toString();
    }

}
