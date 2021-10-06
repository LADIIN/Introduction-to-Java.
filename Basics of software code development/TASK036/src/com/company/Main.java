package com.company;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Main {

    public static void main(String[] args) {
        for (int i = 32; i <= 127; i++) {
            System.out.println((char) i + " - " + i);
        }
    }
}
