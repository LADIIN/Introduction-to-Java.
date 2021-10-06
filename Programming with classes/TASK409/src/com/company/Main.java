package com.company;

/*
    Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
    метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
    методами. Задать критерии выбора данных и вывести эти данные на консоль.

    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
    Найти и вывести:
    a) список книг заданного автора;
    b) список книг, выпущенных заданным издательством;
    c) список книг, выпущенных после заданного года
 */

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("We", "Evgeniy Zamyatin", "Avon Publications",
                1924, 226, 19.84, "Paperback");
        books[1] = new Book("Sapiens", "Uval Noy Harari", "Sindbad", 2016,
                520, 24.57, "Hard");
        books[2] = new Book("Java Philosophy", "Bruce Eckel", "Piter",
                2014, 700, 42.57, "Hard");
        books[3] = new Book("21 Lessons for the 21st Century", "Uval Noy Harari",
                "Sindbad", 2018, 372, 23.20, "Paperback");
        books[4] = new Book("Darth Plagueis", "James Luceno", "Azbuka",
                2012, 379, 17.18, "Hard");

        BookList list = new BookList("My Books:", books);

        System.out.println(list.getListName() + list);

        int year = 2015;
        String author = "Uval Noy Harari";
        String publisher = "Azbuka";

        System.out.println("Books of author - " + author + ":\n" + list.findBooksOfCertainAuthor(author) +
                "\nBooks of publisher - " + publisher + ":\n" + list.findBooksOfCertainPublisher(publisher)
                + "\nBook published after " + year + " year:\n" + list.findBooksYearAbove(year));
    }
}
