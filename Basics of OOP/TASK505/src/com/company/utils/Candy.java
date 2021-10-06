package com.company.utils;

public class Candy extends Sweet {

    public Candy(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return "\nCandy: " + this.getName() +
                "\nWeight: " + this.getWeight() +
                "\nPrice: " + this.getPrice() + "\n";
    }
}
