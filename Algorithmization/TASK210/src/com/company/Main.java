package com.company;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of numbers: ");
        int size = scanner.nextInt();

        int[] array = createRandomIntArray(size);

        printArray(array);

        compressArray(array);
        System.out.println("\nResult: ");
        printArray(array);
    }

    public static void compressArray(int[] array) {
        int elementsDeleted = 0;

        for (int i = 1; i < array.length; i += 2) {
            for (int j = i; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            elementsDeleted++;
        }

        for (int i = array.length - elementsDeleted; i < array.length; i++) {
            array[i] = 0;
        }
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
