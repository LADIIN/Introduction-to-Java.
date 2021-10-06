package com.company;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

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

        System.out.println("Choose first column: ");
        int col1 = scanner.nextInt();

        System.out.println("Choose second column: ");
        int col2 = scanner.nextInt();

        swapColumns(matrix, col1 - 1, col2 - 1);

        System.out.println("\nResult: ");
        printMatrix(matrix);
    }

    public static void swapColumns(int[][] matrix, int col1, int col2) {
        col1 = (col1 > 0) ? col1 : -col1;
        col2 = (col2 > 0) ? col2 : -col2;

        if (col1 < matrix[0].length && col2 < matrix[0].length) {
            int temp;
            for (int i = 0; i < matrix.length; i++) {
                temp = matrix[i][col1];
                matrix[i][col1] = matrix[i][col2];
                matrix[i][col2] = temp;
            }
        } else {
            System.out.println("Incorrect columns value.");
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
