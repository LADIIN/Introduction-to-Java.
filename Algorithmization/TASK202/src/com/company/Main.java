package com.company;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter amount of numbers: ");
        int size = scanner.nextInt();

        size = (size > 0) ? size : -size;

        System.out.println("Enter Z: ");
        double z = scanner.nextDouble();

        double[] array = new double[size];
        double scale = Math.pow(10, 2);
        int replacements = 0;

        for (int i = 0; i < size; i++) {
            array[i] = array[i] = Math.ceil((Math.random() * 200 - 100) * scale) / scale;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < size; i++) {
            if (array[i] > z) {
                array[i] = z;
                replacements++;
            }
        }

        System.out.println("\nResult: ");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nReplacements: " + replacements);


    }
}
