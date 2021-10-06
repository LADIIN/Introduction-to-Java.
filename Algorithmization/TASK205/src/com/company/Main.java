package com.company;

//Даны целые числа а1 ,а2 ,..., аn .
//Вывести на печать только те числа, для которых аi > i

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of numbers: ");
        int size = scanner.nextInt();

        int[] array = createRandomIntArray(size);

        printArray(array);

        System.out.println("\nResult: ");
        getSpecialNumbers(array);
        
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

    public static void getSpecialNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
