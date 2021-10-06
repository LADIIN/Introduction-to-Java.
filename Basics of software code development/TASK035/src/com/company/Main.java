package com.company;

//Даны  числовой  ряд  и  некоторое  число  е.
// Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен заданному е.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter e: ");
        double e = scanner.nextDouble();

        double result = 0;
        double a = 1.0 / 2.0 + 1.0 / 3.0;

        if (a > e) {
            result += a;

            for (int i = 2; a > e; i++) {
                a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
                result += a;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("There is no such numbers.");
        }

    }
}
