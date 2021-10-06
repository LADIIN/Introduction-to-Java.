package com.company;

import java.util.Scanner;

/*
 Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time in seconds: ");
        int time = scanner.nextInt();

        time = (time > 0) ? time : -time;

        System.out.println(time / 3600 + "ч "
                + (time % 3600) / 60 + "м " + (time % 60) + "с");
    }
}
