package com.company;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            int[][] matrix = createSpecialMatrix(n);

            printMatrix(matrix);
        } else {
            System.out.println("N must be even.");
        }

    }

    public static int[][] createSpecialMatrix(int n) {
        n = (n > 0) ? n : -n;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                matrix[i][j] = 1;
            }
        }
        for (int i = n - 1; i >= n / 2; i--) {
            for (int j = i; j >= n - i - 1; j--) {
                matrix[i][j] = 1;
            }
        }


        return matrix;
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
