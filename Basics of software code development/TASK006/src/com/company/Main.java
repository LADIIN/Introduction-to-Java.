package com.company;

import java.util.Scanner;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("X: ");
        double x = scanner.nextDouble();

        System.out.println("Y: ");
        double y = scanner.nextDouble();

        System.out.println(x >= -4 && x <= 4 && y >= -3 && y <= 0
                || x >= -2 && x <= 2 && y >= 0 && y <= 4);

    }
}
