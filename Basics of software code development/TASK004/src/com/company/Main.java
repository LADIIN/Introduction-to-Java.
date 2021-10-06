package com.company;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//        дробную и целую части числа и вывести полученное значение числ


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number like nnn.ddd:");
        double number = scanner.nextDouble();

        number = (number > 0) ? number : -number;

        if (Math.round(number) > 100 && Math.round(number) < 1000
                && Double.toString(number).length() == 7) {
            System.out.println((number * 1000) % 1000 + Math.round(number) / 1000.0);
        } else {
            System.out.println("Number must be like nnn.ddd .");
        }
    }
}
