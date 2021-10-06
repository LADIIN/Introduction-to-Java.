package com.company;

//Вычислить  площадь  правильного  шестиугольника  со  стороной  а,  используя  метод  вычисления  площади
//треугольника.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side of hexagon: ");
        double a = scanner.nextInt();

        System.out.println(findHexagonSquare(a));
    }

    public static double findHexagonSquare(double a) {
        return 6 * findTriangleSquare(a);
    }

    public static double findTriangleSquare(double a) {
        a = (a > 0) ? a : -a;

        return (a * a * Math.sqrt(3)) / 4;
    }

}
