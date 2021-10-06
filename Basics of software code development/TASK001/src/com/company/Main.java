package com.company;
import java.util.Scanner;

// Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = in.nextDouble();

        System.out.println("Enter b: ");
        double b = in.nextDouble();

        System.out.println("Enter c: ");
        double c = in.nextDouble();

        System.out.println("Your result:" + ((a - 3) * b / 2 + c));
    }
}
