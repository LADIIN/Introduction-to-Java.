package com.company;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = createMatrix(rows, cols);

        printMatrix(matrix);

        System.out.println("\nResult");

        replaceOddNumbers(matrix, getMaxElement(matrix));

        printMatrix(matrix);

    }

    public static int[][] createMatrix(int rows, int cols) {
        rows = (rows > 0) ? rows : -rows;
        cols = (cols > 0) ? cols : -cols;

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(21) - 10;
            }
        }
        return matrix;
    }

    public static int getMaxElement(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] rows : matrix) {
            for (int element : rows) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    public static void replaceOddNumbers(int[][] matrix, int max) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
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
