package com.company;

//Сортировка выбором. Дана последовательность чисел .Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

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
        for (int i = 0; i < array.length; i++) {
            int imax = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[imax]) {
                    imax = j;
                }
            }
            temp = array[imax];
            array[imax] = array[i];
            array[i] = temp;
        }
    }

    public static int[] createSequence(int size) {
        size = (size > 0) ? size : -size;

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        return array;
    }

}
