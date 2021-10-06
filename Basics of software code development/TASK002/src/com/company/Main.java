package com.company;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑏+√𝑏2 +4𝑎𝑐
2𝑎 −𝑎3𝑐+𝑏−2
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        System.out.println("\nResult: " + ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)
                / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2))));


    }
}
