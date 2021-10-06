package com.company;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();

        System.out.println("Result: " + areRelativelyPrime(a, b, c));
    }

    public static int findGCD(int a, int b) {
        a = (a > 0) ? a : -a;
        b = (b > 0) ? b : -b;

        int temp;

        while (b != 0) {
            temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }


    public static boolean areRelativelyPrime(int a, int b, int c) {
        return findGCD(a, b) == 1 && findGCD(a, c) == 1 && findGCD(b, c) == 1;
    }


}
