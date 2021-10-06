package com.company.utils;

public class Cookie extends Sweet {

    Cookie(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return "\nCookie: " + this.getName() +
                "\nWeight: " + this.getWeight() +
                "\nPrice: " + this.getPrice() + "\n";
    }
}
