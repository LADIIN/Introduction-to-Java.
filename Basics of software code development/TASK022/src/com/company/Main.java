package com.company;

//Найти max{min(a, b), min(c, d)}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        System.out.println("d: ");
        double d = scanner.nextDouble();

        double min1 = (a > b) ? b : a;
        double min2 = (c > d) ? d : c;
        double max = (min1 > min2) ? min1 : min2;

        System.out.println(max);
    }
}
