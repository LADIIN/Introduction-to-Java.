package com.company;

//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        System.out.println("Result: " + countSubtractions(number));
    }

    public static int countSubtractions(int number) {
        number = (number > 0) ? number : -number;

        int counter = 0;
        while (number != 0) {
            number -= sumDigits(number);
            counter++;
        }
        return counter;
    }

    public static int sumDigits(int number) {
        number = (number > 0) ? number : -number;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
