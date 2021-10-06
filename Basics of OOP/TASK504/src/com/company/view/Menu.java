package com.company.view;

/*
    Создать консольное приложение, удовлетворяющее следующим требованиям:
    • Приложение должно быть объектно-, а не процедурно-ориентированным.
    • Каждый класс должен иметь отражающее смысл название и информативный состав.
    • Наследование должно применяться только тогда, когда это имеет смысл.
    • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
    • Классы должны быть грамотно разложены по пакетам.
    • Консольное меню должно быть минимальным.
    • Для хранения данных можно использовать файлы.

    Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
    дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
    выбора сокровищ на заданную сумму
 */

import com.company.model.Cave;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static int showMenu() {
        int choice = -1;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("""
                                        
                    Choose operation:
                    [1]\tShow all treasures
                    [2]\tFind the most valuable treasure
                    [3]\tFind treasures in certain range
                    [0]\tExit""");

            choice = scanner.nextInt();

        } catch (InputMismatchException exception) {
            System.out.println("\nError: Entered non-integer value.");
            scanner.next();
        }

        return choice;

    }

    public static void runMenu(Cave cave) {
        boolean exit = false;
        int choice, min, max;

        Scanner scanner = new Scanner(System.in);

        while (!exit && !cave.getTreasuresList().isEmpty()) {
            choice = showMenu();

            switch (choice) {
                case 0:
                    System.out.println("\nProgram finished work.");
                    exit = true;
                    break;
                case 1:
                    System.out.println(cave.getName() + cave.getTreasuresList());
                    break;
                case 2:
                    System.out.println("\nThe most valuable treasure:\n" + cave.findMostValuableTreasure());
                    break;
                case 3:
                    try {
                        System.out.println("\nEnter min value: ");
                        min = scanner.nextInt();
                        System.out.println("\nEnter max value: ");
                        max = scanner.nextInt();

                        System.out.println("\nTreasures in range from " + min + " to " + max + ":\n"
                                + cave.findTreasuresInPriceRange(min, max));

                    } catch (InputMismatchException exception) {
                        System.out.println("\nError: Entered non-integer value.");
                        scanner.next();
                    }
                    break;
                default:
                    System.out.println("\nThere is no such operation.");
            }
        }
    }

}
