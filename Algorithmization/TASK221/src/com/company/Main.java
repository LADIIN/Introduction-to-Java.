package com.company;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = createMatrix(10, 20);

        printMatrix(matrix);

        printSpecialRows(matrix);
    }

    public static int[][] createMatrix(int rows, int cols) {
        rows = (rows > 0) ? rows : -rows;
        cols = (cols > 0) ? cols : -cols;

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(16);
            }
        }
        return matrix;
    }

    public static void printSpecialRows(int[][] matrix) {
        int amount;
        for (int i = 0; i < matrix.length; i++) {
            amount = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 5) {
                    amount++;
                }
            }
            if (amount >= 3) {
                System.out.println("Row #" + (i + 1));
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
