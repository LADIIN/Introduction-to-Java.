package com.company;

//Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.  Для решения задачи
//использовать декомпозицию. 

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter k for [1,k]: ");
        int k = scanner.nextInt();

        printArmstrongNumbers(k);
    }

    public static void printArmstrongNumbers(int k) {
        if (k > 1) {
            for (int number = 1; number < k; number++) {
                if (isArmstrong(number)) {
                    System.out.println(number);
                }
            }
        } else {
            System.out.println("Incorrect interval.");
        }
    }

    public static boolean isArmstrong(int number) {
        return sumDigitsInPower(number, countDigits(number)) == number;
    }

    public static int sumDigitsInPower(int number, int power) {
        number = (number > 0) ? number : -number;
        int sum = 0;

        while (number != 0) {
            sum += Math.pow(number % 10, power);
            number /= 10;
        }
        return sum;
    }

    public static int countDigits(int number) {
        number = (number > 0) ? number : -number;

        int quantity = (number == 0) ? 1 : 0;

        while (number != 0) {
            quantity++;
            number /= 10;
        }
        return quantity;
    }
}
