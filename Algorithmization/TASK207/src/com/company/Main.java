package com.company;

//Даны действительные числа.Найти max(....)


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of numbers: ");
        int size = scanner.nextInt();

        double[] array = createRandomDoubleArray(size);

        printArray(array);

        System.out.println("\nResult: " + getMaxNumber(array));

    }

    public static void transformArray(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] += array[i + 1];
        }
    }

    public static double getMaxNumber(double[] array) {
        transformArray(array);

        double max = array[0];

        for (double element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
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
