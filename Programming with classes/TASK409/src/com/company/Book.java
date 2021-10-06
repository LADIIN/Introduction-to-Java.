package com.company;

import java.util.Calendar;

public class Book {
    private String title;
    private String author;
    private String publishingHouse;
    private int publishingYear;
    private int pages;
    private double cost;
    private String bindingType;

    Book(String title, String author, String publishingHouse, int publishingYear,
         int pages, double cost, String bindingType) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublishingHouse(publishingHouse);
        this.setPublishingYear(publishingYear);
        this.setPages(pages);
        this.setCost(cost);
        this.setBindingType(bindingType);
    }

    Book() {
        this.setTitle("");
        this.setAuthor("");
        this.setPublishingHouse("");
        this.setPublishingYear(0);
        this.setPages(0);
        this.setCost(0);
        this.setBindingType("");
    }

    @Override
    public String toString() {
        return "\nTitle: " + this.getTitle()
                + "\nAuthor: " + this.getAuthor()
                + "\nPublishing house: " + this.getPublishingHouse()
                + "\nPublishing year: " + this.getPublishingYear()
                + "\nPages: " + this.getPages()
                + "\nCost: " + this.getCost()
                + "\nBinding type: " + this.getBindingType() + "\n";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setPublishingYear(int publishingYear) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        if (publishingYear <= currentYear && publishingYear > 0) {
            this.publishingYear = publishingYear;
        } else {
            this.publishingYear = 0;
        }
    }

    public void setPages(int pages) {
        this.pages = Math.abs(pages);
    }

    public void setCost(double cost) {
        this.cost = Math.abs(cost);
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getPages() {
        return pages;
    }

    public double getCost() {
        return cost;
    }

    public String getBindingType() {
        return bindingType;
    }
}
