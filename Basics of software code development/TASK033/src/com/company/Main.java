package com.company;

//Найти сумму квадратов первых ста чисел.

public class Main {

    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 100; i++) {
            result += Math.pow(i, 2);
        }
        System.out.println("Sum of first 100 numbers: " + result);
    }
}
