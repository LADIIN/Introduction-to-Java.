package com.company;

//В массив A [N] занесены натуральные числа.
//Найти сумму тех элементов, которые кратны данному К

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();

        System.out.println("Enter k: ");
        int k = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(30) + 1;
        }

        System.out.println("Array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println("\nResult: ");

        for (int i = 0; i < size; i++) {
            if (array[i] % k == 0) {
                System.out.println(array[i]);
            }
        }

    }
}
