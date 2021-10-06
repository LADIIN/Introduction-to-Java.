package com.company;

//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. 

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of dots: ");
        int size = scanner.nextInt();

        int[][] array = createArrayOfDots(size);

        printArray(array);

        int imax = findMaxDistancePair(array);

        System.out.println("Max distance between: " +
                "(" + array[imax][0] + "," + array[imax][1] + ") and "
                + "(" + array[imax][2] + "," + array[imax][3] + ")");
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) - Math.pow(y1 - y2, 2));
    }

    public static int findMaxDistancePair(int[][] array) {
        double max = calculateDistance(array[0][0], array[0][1], array[0][2], array[0][3]);
        double distance;
        int maxPair = 0;

        for (int i = 0; i < array.length; i++) {
            distance = calculateDistance(array[i][0], array[i][1], array[i][2], array[i][3]);
            if (distance > max) {
                max = distance;
                maxPair = i;
            }
        }
        return maxPair;
    }

    public static int[][] createArrayOfDots(int size) {
        size = (size > 0) ? size : -size;

        Random random = new Random();

        int[][] array = new int[size][4];

        for (int i = 0; i < array.length; i++) {
            array[i][0] = random.nextInt(21) - 10;
            array[i][1] = random.nextInt(21) - 10;
            array[i][2] = random.nextInt(21) - 10;
            array[i][3] = random.nextInt(21) - 10;
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] dot : array) {
            System.out.println("(" + dot[0] + "," + dot[1] + ") and "
                    + "(" + dot[2] + "," + dot[3] + ")");
        }
    }
}
