package com.company;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A: ");
        int a = scanner.nextInt();

        System.out.println("B: ");
        int b = scanner.nextInt();

        System.out.println("LCM: " + findLCM(a, b));
    }

    public static int findLCM(int a, int b) {
        a = (a > 0) ? a : -a;
        b = (b > 0) ? b : -b;

        if (a * b != 0) {
            return (a * b) / findGCD(a, b);
        }
        return 0;

    }

    public static int findGCD(int a, int b) {
        a = (a > 0) ? a : -a;
        b = (b > 0) ? b : -b;

        if (a * b != 0) {
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= b;
                }
            }
            return a + b;
        }
        return 1;
    }
}
