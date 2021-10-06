package com.company;

//Даны дроби. Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of fractions: ");
        int size = scanner.nextInt();

        int[] numerators = createIntArray(size);
        int[] denominators = createIntArray(size);

        printFraction(numerators, denominators);

        leadToCommonDenominator(numerators, denominators);
        sortNumerators(numerators);

        printFraction(numerators, denominators);

    }

    public static int findCommonDenominator(int[] denominators) {
        int maxNumber = findMaxNumber(denominators);

        int amount = 1;
        int i;

        for (i = maxNumber; amount != denominators.length; i++) {
            amount = 0;
            for (int element : denominators) {
                if (i % element == 0) {
                    amount += 1;
                }
            }
        }

        return i - 1;
    }

    public static void leadToCommonDenominator(int[] numerators, int[] denominators) {
        int commonDenominator = findCommonDenominator(denominators);
        for (int i = 0; i < numerators.length; i++) {
            numerators[i] *= commonDenominator / denominators[i];
            denominators[i] = commonDenominator;
        }
    }

    public static void sortNumerators(int[] numerators) {
        int temp;
        for (int i = 0; i < numerators.length - 1; i++) {
            for (int j = 0; j < numerators.length - i - 1; j++) {
                if (numerators[j] > numerators[j + 1]) {
                    temp = numerators[j + 1];
                    numerators[j + 1] = numerators[j];
                    numerators[j] = temp;
                }
            }
        }
    }

    public static int findMaxNumber(int[] denominators) {
        int maxNumber = denominators[0];
        for (int element : denominators) {
            if (element > maxNumber) {
                maxNumber = element;
            }
        }
        return maxNumber;
    }

    public static void printFraction(int[] numerators, int[] denominators) {
        for (int i = 0; i < numerators.length; i++) {
            System.out.print(numerators[i] + "/" + denominators[i] + "\t");
        }
    }

    public static int[] createIntArray(int size) {
        size = (size > 0) ? size : -size;

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        return array;
    }
}
