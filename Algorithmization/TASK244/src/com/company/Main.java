package com.company;

//Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  элементами  которого
//являются цифры числа N.

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter natural number: ");
        int number = scanner.nextInt();

        System.out.println(Arrays.toString(createArrayFromDigits(number)));
    }

    public static int[] createArrayFromDigits(int number) {
        number = (number > 0) ? number : -number;

        int[] array = new int[Integer.toString(number).length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = takeLastDigit(number);
            number /= 10;
        }
        return array;
    }


    public static int takeLastDigit(int number) {
        number = (number > 0) ? number : -number;
        return number % 10;
    }
}
