package com.company;

//Пусть даны две неубывающие последовательности действительных чисел.
//Требуется указать те места, на которые нужно вставлять элементы последовательности в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of first sequence: ");
        int size1 = scanner.nextInt();

        System.out.println("Enter length of second sequence: ");
        int size2 = scanner.nextInt();

        double[] sequence1 = createSequence(size1, 0.1);
        double[] sequence2 = createSequence(size2, 0.3);

        System.out.println(Arrays.toString(sequence1));
        System.out.println(Arrays.toString(sequence2));

        printInsertPositions(sequence1, sequence2);

    }

    public static void printInsertPositions(double[] sequence1, double[] sequence2) {

        int length = Math.min(sequence1.length, sequence2.length);

        for (int i = 0; i < length; i++) {
            if (sequence2[i] > sequence1[i]) {
                System.out.println("Position for " + sequence2[i]
                        + " is after " + (i + 1));
            }
        }

    }

    public static double[] createSequence(int size, double start) {
        size = (size > 0) ? size : -size;

        double[] array = new double[size];

        double scale = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = ((start++) * scale) / scale;
        }

        return array;
    }
}
