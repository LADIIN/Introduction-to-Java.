package com.company;

public class Sentence {
    private String sentence;

    Sentence(String sentence) {
        this.setSentence(sentence);
    }

    @Override
    public String toString() {
        return getSentence();
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
