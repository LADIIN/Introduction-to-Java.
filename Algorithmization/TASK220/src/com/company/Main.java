package com.company;

//Найти положительные элементы главной диагонали квадратной матрицы.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        int[][] matrix = createSquareMatrix(n);

        printMatrix(matrix);

        System.out.println("\nResult: " + countPostiveNumbers(matrix));
    }

    public static int[][] createSquareMatrix(int n) {
        n = (n > 0) ? n : -n;

        int[][] matrix = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(20) - 10;
            }
        }
        return matrix;
    }

    public static int countPostiveNumbers(int[][] matrix) {
        int result = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                result++;
            }
        }

        return result;
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int element : rows) {
                System.out.print(element + "\t");
            }
            System.out.println(" ");
        }
    }
}
