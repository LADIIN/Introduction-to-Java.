package com.company;

//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой. 

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x: ");
        double x = scanner.nextDouble();
        System.out.println("y: ");
        double y = scanner.nextDouble();
        System.out.println("z: ");
        double z = scanner.nextDouble();
        System.out.println("t: ");
        double t = scanner.nextDouble();

        System.out.println("Square: " + calculateQuadrangleSquare(x, y, z, t));
    }

    public static double calculateQuadrangleSquare(double x, double y, double z, double t) {
        return calculateRightTriangleSquare(x, y) + calculateTriangleSquare(z, t, Math.sqrt(x * x + y * y));
    }

    public static double calculateRightTriangleSquare(double x, double y) {
        x = (x > 0) ? x : -x;
        y = (y > 0) ? y : -y;

        return x * y * 0.5;
    }

    public static double calculateTriangleSquare(double z, double t, double k) {
        z = (z > 0) ? z : -z;
        t = (t > 0) ? t : -t;
        k = (k > 0) ? k : -k;

        if (z + t > k && z + k > t && t + k > z) {
            double p = (z + t + k) / 2;

            return Math.sqrt(p * (p - z) * (p - t) * (p - k));
        }
        return -1;
    }

}
