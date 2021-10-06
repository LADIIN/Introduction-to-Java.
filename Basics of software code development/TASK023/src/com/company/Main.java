package com.company;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
// Определить, будут ли они расположены на одной прямой.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("X1: ");
        int x1 = scanner.nextInt();

        System.out.println("Y1: ");
        int y1 = scanner.nextInt();

        System.out.println("X2: ");
        int x2 = scanner.nextInt();

        System.out.println("Y2: ");
        int y2 = scanner.nextInt();

        System.out.println("X3: ");
        int x3 = scanner.nextInt();

        System.out.println("Y3: ");
        int y3 = scanner.nextInt();

        if ((y3 - y1) * (x2 - x1) == (x3 - x1) * (y2 - y1)) {
            System.out.println("All dots can be placed on one line. ");
        } else {
            System.out.println("All dots cant be placed on one line.");
        }

    }
}
