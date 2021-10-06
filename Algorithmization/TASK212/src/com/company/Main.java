package com.company;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. 

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of square matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = createRandomMatrix(size);

        printMatrix(matrix);

        System.out.println("\nResult: ");

        printElementsOnDiagonal(matrix);

    }

    public static void printElementsOnDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + "\t");
        }
    }

    public static int[][] createRandomMatrix(int size) {
        size = (size > 0) ? size : -size;

        int[][] matrix = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
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
