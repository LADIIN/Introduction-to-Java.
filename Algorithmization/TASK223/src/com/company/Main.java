package com.company;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов. 

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = createMatrix(3, 4);

        printMatrix(matrix);

        sortColumnsAscending(matrix);
        System.out.println("\nAscending sorting: ");
        printMatrix(matrix);

        sortColumnsDescending(matrix);
        System.out.println("\nDescending sorting: ");
        printMatrix(matrix);
    }

    public static int[][] createMatrix(int rows, int cols) {
        rows = (rows > 0) ? rows : -rows;
        cols = (cols > 0) ? cols : -cols;

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(20) - 10;
            }
        }
        return matrix;
    }

    public static void sortColumnsAscending(int[][] matrix) {
        int temp;

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                for (int k = 0; k < matrix.length - j - 1; k++) {
                    if (matrix[k][i] > matrix[k + 1][i]) {
                        temp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = temp;
                    }
                }
            }
        }
    }

    public static void sortColumnsDescending(int[][] matrix) {
        int temp;

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                for (int k = 0; k < matrix.length - j - 1; k++) {
                    if (matrix[k][i] < matrix[k + 1][i]) {
                        temp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = temp;
                    }
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
