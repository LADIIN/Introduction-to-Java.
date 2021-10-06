package com.company;

//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы)  для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = createRandomIntArray(size);

        System.out.println(Arrays.toString(array));

        printSumOfThreeInRowNumbers(array);
    }

    public static void printSumOfThreeInRowNumbers(int[] array) {
        for (int i = 0; i < array.length; i += 3) {
            System.out.println("Sum: " + sumNumbers(array, i, i + 2));
        }
    }

    public static int sumNumbers(int[] array, int beg, int end) {
        beg = (beg > 0) ? beg : -beg;
        end = (end > 0) ? end : -end;

        if (beg < end) {
            int sum = 0;

            for (int i = beg; i <= end && i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            return 0;
        }

    }

    public static int[] createRandomIntArray(int size) {
        size = (size > 0) ? size : -size;

        Random random = new Random();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        return array;
    }
}