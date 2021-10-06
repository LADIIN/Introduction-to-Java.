package com.company;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = scanner.nextInt();

        System.out.println("Enter number of row to print: ");
        int row = scanner.nextInt();

        System.out.println("Enter number of column to print: ");
        int col = scanner.nextInt();

        if (rows == 0 || cols == 0) {
            System.out.println("Incorrect data.");
        } else {
            int[][] matrix = createRandomMatrix(rows, cols);

            printMatrix(matrix);

            System.out.println("\nRow: ");
            printRow(matrix, row);

            System.out.println("\nColumn: ");

            printColumn(matrix, col);
        }
    }

    public static void printRow(int[][] matrix, int row) {
        if (row <= matrix.length && row > 0) {
            for (int element : matrix[row - 1]) {
                System.out.print(element + "\t");
            }
        } else {
            System.out.println("There is no such row.");
        }
    }

    public static void printColumn(int[][] matrix, int col) {
        if (col <= matrix[0].length && col > 0) {
            for (int[] row : matrix) {
                System.out.println(row[col - 1]);
            }
        } else {
            System.out.println("There is no such column.");
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
