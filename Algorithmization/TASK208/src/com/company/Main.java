package com.company;

//Дана  последовательность  целых  чисел  .  Образовать  новую  последовательность,  выбросив  из
//исходной те члены, которые равны.


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of numbers: ");
        int size = scanner.nextInt();

        int[] array = createRandomIntArray(size);

        array = deleteMinElements(array);

        printArray(array);
    }

    public static int[] deleteMinElements(int[] array) {
        int min = getMinNumber(array);

        int[] newArray = new int[array.length - countMinNumbers(array, min)];
        int i = 0;

        for (int element : array) {
            if (element != min) {
                newArray[i] = element;
                i++;
            }
        }
        return newArray;
    }

    public static int getMinNumber(int[] array) {
        int min = array[0];

        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static int countMinNumbers(int[] array, int min) {
        int amount = 0;

        for (int element : array) {
            if (element == min) {
                amount++;
            }
        }
        return amount;
    }

    public static int[] createRandomIntArray(int size) {
        Random random = new Random();

        size = (size > 0) ? size : -size;

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt() % 21;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }

}
