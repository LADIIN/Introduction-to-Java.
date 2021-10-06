package com.company;

public class Word {
    private String word;

    Word(String word) {
        this.setWord(word);
    }

    @Override
    public String toString() {
        return getWord();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
