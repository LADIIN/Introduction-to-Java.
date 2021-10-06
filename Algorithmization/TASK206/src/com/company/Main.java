package com.company;

//адана последовательность N  вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых являются простыми числами.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of numbers: ");
        int size = scanner.nextInt();

        double[] array = createRandomDoubleArray(size);

        printArray(array);

        System.out.println("\nResult: " + getSumOfSpecialNumbers(array));

    }

    public static double getSumOfSpecialNumbers(double[] array) {
        double sum = 0;

        for (int i = 2; i < array.length; i++) {
            if (isPrime(i)) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
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
