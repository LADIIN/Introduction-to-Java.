package com.company;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width of hole: ");
        double width = scanner.nextDouble();

        System.out.println("Enter length of hole: ");
        double length = scanner.nextDouble();

        System.out.println("Enter brick X: ");
        double x = scanner.nextDouble();

        System.out.println("Enter brick Y: ");
        double y = scanner.nextDouble();

        System.out.println("Enter brick Z: ");
        double z = scanner.nextDouble();

        if (width * length <= x * y || width * length <= x * z || width * length <= z * y) {
            System.out.println("Brick can passes through the hole.");
        } else {
            System.out.println("Brick cant passes through th hole");
        }

    }
}
