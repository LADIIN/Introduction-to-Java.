package com.company;

//Дан  массив  действительных  чисел,  размерность  которого  N.
// Подсчитать,  сколько  в  нем  отрицательных,
//положительных и нулевых элементов.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of numbers: ");
        int size = scanner.nextInt();

        size = (size > 0) ? size : -size;

        double[] array = new double[size];

        fillArrayByDouble(array);

        printArray(array);

        System.out.println("\n\nPositive numbers: " + countPositiveNumbers(array));
        System.out.println("Negative numbers: " + countNegativeNumbers(array));
        System.out.println("Zero numbers: " + countZeroNumbers(array));
    }

    public static int countPositiveNumbers(double[] array) {
        int result = 0;

        for (double element : array) {
            if (element > 0) {
                result++;
            }
        }
        return result;
    }

    public static int countNegativeNumbers(double[] array) {
        int result = 0;
        for (double element : array) {
            if (element < 0) {
                result++;
            }
        }
        return result;
    }

    public static int countZeroNumbers(double[] array) {
        int result = 0;
        for (double element : array) {
            if (element == 0) {
                result++;
            }
        }
        return result;
    }

    public static void fillArrayByDouble(double[] array) {
        double scale = Math.pow(10, 2);

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil((Math.random() * 200 - 100) * scale) / scale;
        }
    }

    public static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + "\t");
        }
    }
}

