package com.company;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один  массив,  включив  второй  массив  между  k-м  и  (k+1)  -  м  элементами  первого,  при  этом  не  используя
//дополнительный массив.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int size = scanner.nextInt();

        System.out.println("Enter size of second array: ");
        int size2 = scanner.nextInt();

        System.out.println("Enter position in first array to insert: ");
        int k = scanner.nextInt();

        int[] arrayTo = createRandomIntArray(size);
        int[] arrayFrom = createRandomIntArray(size2);

        System.out.println("First array: " + Arrays.toString(arrayTo)
                + "\nSecond array: " + Arrays.toString(arrayFrom));

        arrayTo = insertArray(arrayTo, arrayFrom, k - 1);

        System.out.println("Result: " + Arrays.toString(arrayTo));
    }

    public static int[] insertArray(int[] arrayTo, int[] arrayFrom, int k) {
        int length = arrayTo.length;

        if (k < arrayTo.length && k >= 0) {
            arrayTo = Arrays.copyOf(arrayTo, arrayFrom.length + arrayTo.length);

            for (int i = k + 1; i < length; i++) {
                arrayTo[i + arrayFrom.length] = arrayTo[i];
            }

            System.arraycopy(arrayFrom, 0, arrayTo, k + 1, arrayFrom.length);

        } else {
            System.out.println("Incorrect position to insert.");
        }
        return arrayTo;
    }

    public static int[] createRandomIntArray(int size) {
        size = (size > 0) ? size : -size;

        Random random = new Random();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) - 10;
        }

        return array;
    }

}
