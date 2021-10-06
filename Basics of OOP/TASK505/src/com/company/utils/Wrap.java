package com.company.utils;

public class Wrap {
    private String color;
    private String material;

    public Wrap(String color, String material) {
        this.setColor(color);
        this.setMaterial(material);
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getMaterial();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if (!color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "None";
        }
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        if (!material.isEmpty()) {
            this.material = material;
        } else {
            this.material = "None";
        }
    }
}
