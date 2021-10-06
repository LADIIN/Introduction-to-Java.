package com.company;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("GCD: " + findGCD(numbers));
    }

    private static int findGCD(int[] numbers) {
        int a = Math.abs(numbers[0]);
        for (int element : numbers) {
            int b = Math.abs(element);
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }
}
