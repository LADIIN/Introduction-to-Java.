package com.company;

//Вычислить значения функции на отрезке [а,b] c шагом h

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter beginning: ");
        double a = scanner.nextDouble();

        System.out.println("Enter ending: ");
        double b = scanner.nextDouble();

        System.out.println("Enter step: ");
        double h = scanner.nextDouble();

        if (a > b) {
            System.out.println("Wrong data.");
        } else {
            double y;

            for (double x = a; x <= b; x += h) {
                y = (x > 2) ? x : -x;
                System.out.println(y);
            }
        }
    }
}
