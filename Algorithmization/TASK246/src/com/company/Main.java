package com.company;

//Даны натуральные числа К и N.  Написать метод(методы)  формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        System.out.println("Enter N: ");
        int n = scanner.nextInt();
        System.out.println("Enter k: ");
        int k = scanner.nextInt();

        System.out.println(Arrays.toString(createArray(size, n, k)));
    }

    public static int sumDigits(int number) {
        number = (number > 0) ? number : -number;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int[] createArray(int size, int n, int k) {
        Random random = new Random();

        int[] array = new int[size];
        int number;

        for (int i = 0; i < array.length; i++) {
            while (array[i] == 0) {
                number = random.nextInt(2 * n + 1) - n;
                if (sumDigits(number) == k) {
                    array[i] = number;
                }
            }
        }
        return array;
    }


}
