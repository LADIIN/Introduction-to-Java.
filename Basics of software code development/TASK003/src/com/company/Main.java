package com.company;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦
        𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡𝑔 𝑥𝑦
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x:");
        double x = scanner.nextDouble();

        System.out.println("Enter y:");
        double y = scanner.nextDouble();

        System.out.println("\nResult: " + ((Math.sin(x) + Math.cos(y))
                / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y)));
    }
}
