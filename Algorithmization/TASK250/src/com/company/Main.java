package com.company;

//Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Result: " + sumOddDigitsNumbers(n));
    }

    public static long sumOddDigitsNumbers(int n) {
        int start = (int) Math.pow(10, n - 1);
        long sum = 0;

        for (int i = start + 1; i < start * 10; i += 2) {
            if (isOddDigits(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isOddDigits(int number) {

        while (number != 0) {
            if ((number % 10) % 2 == 0) {
                return false;
            }
            number /= 10;
        }

        return true;
    }
}
