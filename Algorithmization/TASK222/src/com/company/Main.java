package com.company;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = createMatrix(3, 4);

        printMatrix(matrix);

        sortRowsAscending(matrix);
        System.out.println("\nAscending sorting: ");
        printMatrix(matrix);

        sortRowsDescending(matrix);
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

    public static void sortRowsAscending(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                for (int k = 0; k < matrix[0].length - j - 1; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    public static void sortRowsDescending(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                for (int k = 0; k < matrix[0].length - j - 1; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
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
