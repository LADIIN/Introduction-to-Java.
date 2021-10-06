package com.company;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Longest number: " + findLongestNumber(a, b));
    }

    public static int findLongestNumber(int a, int b) {
        return (countDigits(a) > countDigits(b)) ? a : b;
    }


    public static int countDigits(int number) {
        int quantity = (number == 0) ? 1 : 0;

        while (number != 0) {
            quantity++;
            number /= 10;
        }
        return quantity;
    }

}
