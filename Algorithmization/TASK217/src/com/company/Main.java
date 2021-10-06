package com.company;

//Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней.:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        double[][] matrix = createSpecialMatrix(n);

        printMatrix(matrix);
        System.out.println("\nNumber of positive numbers: " + countPositiveNumbers(matrix));
    }

    public static double[][] createSpecialMatrix(int n) {
        n = (n > 0) ? n : -n;

        double[][] matrix = new double[n][n];

        double scale = Math.pow(10, 3);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.ceil(Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n) * scale) / scale;
            }
        }

        return matrix;
    }

    public static int countPositiveNumbers(double[][] matrix) {
        int result = 0;

        for (double[] row : matrix) {
            for (double element : row) {
                if (element > 0) {
                    result++;
                }
            }
        }
        return result;
    }


    public static void printMatrix(double[][] matrix) {
        for (double[] rows : matrix) {
            for (double element : rows) {
                System.out.print(element + "\t");
            }
            System.out.println(" ");
        }
    }
}
