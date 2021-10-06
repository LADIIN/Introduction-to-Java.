package com.company;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of factorials of odd numbers from 1 to 9: "
                + sumFactorialsOfOddNumbers());

    }

    public static int sumFactorialsOfOddNumbers() {
        int sum = 0;

        for (int number = 1; number <= 9; number += 2) {
            sum += calculateFactorial(number);
        }

        return sum;
    }

    public static int calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

}
