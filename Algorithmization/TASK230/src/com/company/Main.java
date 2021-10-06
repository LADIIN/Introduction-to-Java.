package com.company;

//Сортировка обменом

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
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

    public static int[] createSequence(int size) {
        size = (size > 0) ? size : -size;

        int[] array = new int[size];

        int number = array.length;

        for (int i = 0; i < array.length; i++) {
            array[i] = number--;
        }

        return array;
    }

}
