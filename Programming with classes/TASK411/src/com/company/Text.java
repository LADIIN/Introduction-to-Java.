package com.company;

import java.util.ArrayList;

public class Text {
    private Word title;
    private ArrayList<Sentence> sentences;

    Text(Word title, ArrayList<Sentence> sentences) {
        this.setTitle(title);
        this.setSentences(sentences);
    }

    Text(Word title, Sentence sentence) {
        this.setTitle(title);
        this.setSentences(new ArrayList<Sentence>());
        this.getSentences().add(sentence);
    }

    Text() {
        this.setTitle(new Word(""));
        this.setSentences(new ArrayList<Sentence>());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getTitle()).append("\n");

        for (Sentence sentence : this.getSentences()) {
            stringBuilder.append(sentence).append("\n");
        }

        return stringBuilder.toString();
    }

    public void addSentence(Sentence sentence) {
        this.sentences.add(sentence);
    }


    public Word getTitle() {
        return title;
    }

    public void setTitle(Word title) {
        this.title = title;
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }

}
