package com.company;

public class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return "\nProduct: " + this.getName() + "___________" + this.getPrice() + " Br";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = Math.abs(price);
    }
}
