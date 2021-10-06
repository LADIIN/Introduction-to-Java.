package com.company;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить

public class Main {

    public static void main(String[] args) {
        Directory directory = new Directory("Text files");
        directory.createFile("text.txt");

        TextFile file = directory.getFile("text.txt");

        file.setText("There is a lot of information in this text file.");
        file.addText("We add some more useful information.");
        file.renameFile("VeryUsefulFile.txt");

        System.out.println(directory.getFile("VeryUsefulFile.txt"));
        directory.deleteFile("VeryUsefulFile.txt");

        System.out.println(directory.getFile("VeryUsefulFile.txt"));


    }
}
