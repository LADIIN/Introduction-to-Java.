package com.company;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student("Verstappen", 10701120, new int[]{9, 10, 9, 10, 9});
        students[1] = new Student("Hamilton", 10701219, new int[]{9, 10, 8, 9, 9});
        students[2] = new Student("Norris", 10701120, new int[]{7, 10, 8, 9, 9});
        students[3] = new Student("Sainz", 10701220, new int[]{10, 10, 9, 9, 9});
        students[4] = new Student("Leclerc", 10701320, new int[]{9, 9, 9, 9, 9});
        students[5] = new Student("Gasly", 10702119, new int[]{9, 8, 9, 8, 8});
        students[6] = new Student("Russel", 10702220, new int[]{9, 9, 9, 9, 10});
        students[7] = new Student("Ricciardo", 10701119, new int[]{7, 9, 6, 9, 8});
        students[8] = new Student("Alonso", 10701117, new int[]{8, 9, 8, 9, 10});
        students[9] = new Student("Perez", 10701219, new int[]{9, 9, 9, 9, 9});

        System.out.println("Excellent students: " + Analyzer.findBestStudents(students));

    }
}
