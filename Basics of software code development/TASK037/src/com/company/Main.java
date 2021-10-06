package com.company;

//Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter m: ");
        int m = scanner.nextInt();
        m = (m > 0) ? m : -m;

        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        n = (n > 0) ? n : -n;

        for (int i = m; i <= n; i++) {
            System.out.println("\nNumber " + i + ":");
            for (int del = 2; del < i; del++) {
                if (i % del == 0) {
                    System.out.println(del);
                }
            }
        }


    }
}
