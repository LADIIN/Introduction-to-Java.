package com.company;

//Даны два числа.
//Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int digit1, digit2;
        int tempSecondNumber;
        boolean flag;

        while (firstNumber != 0) {
            digit1 = firstNumber % 10;
            firstNumber /= 10;
            flag = false;

            tempSecondNumber = secondNumber;

            while (tempSecondNumber != 0) {
                digit2 = tempSecondNumber % 10;
                tempSecondNumber /= 10;

                if (digit1 == digit2) {
                    flag = true;
                }
            }
            if (flag)
                System.out.print(digit1 + "\t");
        }

    }
}
