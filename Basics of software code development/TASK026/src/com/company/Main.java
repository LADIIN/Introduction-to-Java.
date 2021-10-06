package com.company;

// Напишите программу, где пользователь вводит любое  целое  положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter positive integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            for (int i = 1; i < number; i++) {
                System.out.println(i);
            }
        }  else {
            System.out.println("Number must be positive integer.");
        }

    }
}
