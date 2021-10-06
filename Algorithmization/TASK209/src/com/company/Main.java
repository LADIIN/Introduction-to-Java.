package com.company;

//В массиве целых чисел с количеством элементов n  найти наиболее часто встречающееся число.
//Если таких чисел несколько, то определить наименьшее из них.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of numbers: ");
        int size = scanner.nextInt();

        int[] array = createRandomIntArray(size);

        printArray(array);

        System.out.println("\nResult: " + getMostCommonNumber(array));

    }

    public static int getMostCommonNumber(int[] array) {
        int currAmount;
        int amount = 0;
        int result = array[0];

        for (int i = 0; i < array.length; i++) {
            currAmount = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] == array[i]) {
                    currAmount++;
                }
            }
            if (currAmount > amount) {
                amount = currAmount;
                result = array[i];
            } else if (currAmount == amount) {
                result = Math.min(array[i], result);
            }
        }
        return result;
    }


    public static int[] createRandomIntArray(int size) {
        Random random = new Random();

        size = (size > 0) ? size : -size;

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt() % 21;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}
