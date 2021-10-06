package com.company;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = scanner.nextInt();

        if (rows == 0 || cols == 0) {
            System.out.println("Incorrect data.");
        }
        else
        {
            int[][] matrix = createRandomMatrix(rows, cols);

            printMatrix(matrix);

            System.out.println("\nResult: ");
            printSpecialColumns(matrix);
        }
    }

    public static void printSpecialColumns(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j += 2) {
            if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                System.out.println("Column #" + (j + 1));
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        rows = (rows > 0) ? rows : -rows;
        cols = (rows > 0) ? cols : -cols;

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(20) + 1;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int element : rows) {
                System.out.print(element + "\t");
            }
            System.out.println("");
        }
    }
}
