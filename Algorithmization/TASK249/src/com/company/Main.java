package com.company;

//Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        findGrowingNumbers(n);
    }

    public static void findGrowingNumbers(int n) {
        n = (n > 0) ? n : -n;

        if (n != 0) {
            int number = 0;
            int digit;
            int power;
            n--;

            for (int i = 1; i < 10 && number % 10 != 9; i++) {
                number = (int) (i * Math.pow(10, n));
                digit = i;
                power = n;

                while (power != 0) {
                    digit++;
                    power--;
                    number += (digit) * Math.pow(10, power);
                }
                System.out.println(number);
            }
        } else {
            System.out.println("Incorrect n value.");
        }
    }
}
