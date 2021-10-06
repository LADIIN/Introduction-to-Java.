package com.company.model;

import com.company.utils.Rarity;

public class Treasure {
    private String name;
    private String description;
    private Rarity rarity;
    private double price;

    public Treasure(String name, String description, Rarity rarity, double price) {
        this.setName(name);
        this.setDescription(description);
        this.setRarity(rarity);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return String.format("\nName: %s\nDescription: %s\nRarity: %s\nPrice: %.2f\n",
                this.getName(), this.getDescription(), this.getRarity(), this.getPrice());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Rarity getRarity() {
        return this.rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = Math.abs(price);
    }
}
