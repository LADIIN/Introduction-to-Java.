package com.company;

//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n  -  заданное натуральное число больше 2.  Для
//решения задачи использовать декомпозицию. 

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n for [n,2n]: ");
        int n = scanner.nextInt();

        printTweenNumbers(n);
    }

    public static void printTweenNumbers(int n) {
        if (n > 2) {
            for (int i = n; i <= 2 * n; i++) {
                System.out.println("For " + i + " tweens: " + findLeftTweenNumber(i)
                        + " and " + findRightTweenNumber(i));
            }
        } else {
            System.out.println("n must be higher than 2.");
        }
    }

    public static int findRightTweenNumber(int number) {
        return number + 2;
    }

    public static int findLeftTweenNumber(int number) {
        return number - 2;
    }
}
