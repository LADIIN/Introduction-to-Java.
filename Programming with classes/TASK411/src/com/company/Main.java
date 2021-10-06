package com.company;

/*
Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */

public class Main {

    public static void main(String[] args) {
        Word word = new Word("Sentences");
        Sentence sentence1 = new Sentence("First sentence.");
        Sentence sentence2 = new Sentence("Second sentence.");

        Text text = new Text(word, sentence1);
        text.addSentence(sentence2);

        System.out.println(text);


    }
}
