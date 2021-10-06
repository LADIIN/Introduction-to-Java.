package com.company;

//Даны действительные числа а1 ,а2 ,..., аn .
//Поменять местами наибольший и наименьший элементы.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of numbers: ");
        int size = scanner.nextInt();

        double[] array = createRandomDoubleArray(size);

        printArray(array);

        swapMaxAndMin(array);

        System.out.println("\nResult: ");
        printArray(array);

    }

    public static void swapMaxAndMin(double[] array) {
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }

        double temp = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = temp;
    }


    public static double[] createRandomDoubleArray(int size) {
        size = (size > 0) ? size : -size;

        double[] array = new double[size];

        double scale = Math.pow(10, 2);

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil((Math.random() * 200 - 100) * scale) / scale;
        }

        return array;
    }

    public static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + "\t");
        }
    }
}
