package com.company;

import java.util.Scanner;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First angle: ");
        double angle1 = scanner.nextDouble();

        System.out.println("Second Angle: ");
        double angle2 = scanner.nextDouble();

        if (angle1 + angle2 >= 180) {
            System.out.println("\nThere is no such triangle.");
        } else if (angle1 == 90 || angle2 == 90 || 180 - angle1 - angle2 == 90) {
            System.out.println("This triangle is right.");
        } else {
            System.out.println("This triangle is not right.");
        }

    }
}
