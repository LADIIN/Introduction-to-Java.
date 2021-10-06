package com.company;

//Сортировка Шелла

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of sequence: ");
        int size = scanner.nextInt();

        double[] array = createSequence(size);

        System.out.println(Arrays.toString(array));

        sortArray(array);

        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(double[] array) {
        int gap = array.length / 2;
        double temp;

        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        temp = array[c + gap];
                        array[c + gap] = array[c];
                        array[c] = temp;
                    }
                }
            }
            gap = gap / 2;
        }
    }

    public static double[] createSequence(int size) {
        size = (size > 0) ? size : -size;

        double[] array = new double[size];

        double scale = Math.pow(10, 2);

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil((Math.random() * 200 - 100) * scale) / scale;
        }

        return array;
    }

}
