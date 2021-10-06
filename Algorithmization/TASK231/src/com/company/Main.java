package com.company;

//Сортировка вставками

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of sequence: ");
        int size = scanner.nextInt();

        int[] array = createSequence(size);

        System.out.println(Arrays.toString(array));

        sortArray(array);

        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(int[] array) {
        int insPos, temp;

        for (int i = 0; i < array.length; i++) {
            insPos = searchBinary(array, 0, i, array[i]);
            temp = array[i];

            for (int j = i - 1; j >= insPos; j--) {
                array[j + 1] = array[j];
            }

            array[insPos] = temp;
        }
    }

    public static int searchBinary(int[] array, int left, int right, int element) {
        int current;

        if (left == right) {
            return left;
        }

        current = left + (right - left) / 2;

        if (element > array[current]) {
            return searchBinary(array, current + 1, right, element);
        } else if (element < array[current]) {
            return searchBinary(array, left, current, element);
        }
        return current;
    }

    public static int[] createSequence(int size) {
        size = (size > 0) ? size : -size;

        Random random = new Random();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        return array;
    }

}
