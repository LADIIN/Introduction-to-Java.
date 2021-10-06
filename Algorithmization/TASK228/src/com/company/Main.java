package com.company;

//Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bn. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int size = scanner.nextInt();

        System.out.println("Enter size of second array: ");
        int size2 = scanner.nextInt();

        int[] array1 = createSequence(size, 5);
        int[] array2 = createSequence(size2, 1);

        System.out.println("First array: " + Arrays.toString(array1)
                + "\nSecond array: " + Arrays.toString(array2));

        System.out.println(Arrays.toString(concatenateArrays(array1, array2)));
    }

    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int length = array1.length;

        array1 = Arrays.copyOf(array1, array1.length + array2.length);

        System.arraycopy(array2, 0, array1, length, array2.length);

        Arrays.sort(array1);

        return array1;
    }

    public static int[] createSequence(int size, int firstNum) {
        size = (size > 0) ? size : -size;

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = firstNum++;
        }

        return array;
    }

}
