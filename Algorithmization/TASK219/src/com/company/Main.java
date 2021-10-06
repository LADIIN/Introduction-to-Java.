package com.company;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = createRandomMatrix(rows, cols);

        printMatrix(matrix);

        System.out.println("\nMax column: " + (getMaxColumn(matrix) + 1));

    }

    public static int getMaxColumn(int[][] matrix) {
        int sum, imax = 0, maxSum = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if (sum > maxSum) {
                imax = i;
                maxSum = sum;
            }
        }
        return imax;
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
