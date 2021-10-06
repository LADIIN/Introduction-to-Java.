package com.company.utils;

public abstract class Sweet {
    private String name;
    private double weight;
    private double price;

    Sweet(String name, double weight, double price) {
        this.setName(name);
        this.setWeight(weight);
        this.setPrice(price);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
