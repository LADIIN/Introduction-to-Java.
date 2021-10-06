package com.company;

public class BookList {
    private String listName;
    private Book[] list;

    BookList(String listName, Book[] list) {
        this.setListName(listName);
        this.setList(list);
    }

    BookList() {
        this.setListName("");
        this.setList(new Book[0]);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Book book : this.list) {
            stringBuilder.append(book);
        }
        return stringBuilder.toString();
    }

    public String findBooksOfCertainAuthor(String author) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Book book : this.list) {
            if (book.getAuthor().equals(author)) {
                stringBuilder.append(book);
            }
        }

        return stringBuilder.toString();
    }

    public String findBooksOfCertainPublisher(String publisher) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Book book : this.list) {
            if (book.getPublishingHouse().equals(publisher)) {
                stringBuilder.append(book);
            }
        }

        return stringBuilder.toString();
    }

    public String findBooksYearAbove(int year) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Book book : this.list) {
            if (book.getPublishingYear() > year) {
                stringBuilder.append(book);
            }
        }

        return stringBuilder.toString();
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setList(Book[] list) {
        this.list = list;
    }

    public String getListName() {
        return listName;
    }

    public Book[] getList() {
        return list;
    }
}
