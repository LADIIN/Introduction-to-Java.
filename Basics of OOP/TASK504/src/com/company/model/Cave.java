package com.company.model;

import java.util.ArrayList;

public class Cave {
    private String name;
    private ArrayList<Treasure> treasures;

    Cave(String name) {
        this.setName(name);
        this.setTreasures(new ArrayList<>());
    }

    public Cave(String name, ArrayList<Treasure> treasures) {
        this.setName(name);
        this.setTreasures(treasures);
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public String getTreasuresList() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Treasure treasure : this.getTreasures()) {
            stringBuilder.append(treasure);
        }
        return stringBuilder.toString();
    }

    public Treasure findMostValuableTreasure() {
        Treasure result = this.getTreasures().get(0);

        for (Treasure treasure : this.getTreasures()) {
            if (treasure.getPrice() > result.getPrice()) {
                result = treasure;
            }
        }
        return result;
    }

    public String findTreasuresInPriceRange(double min, double max) {
        boolean result = false;

        if (max < min || max < 0 || min < 0) {
            return "\nWrong range.";
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Treasure treasure : this.getTreasures()) {
            if (treasure.getPrice() >= min && treasure.getPrice() <= max) {
                stringBuilder.append(treasure).append("\n");
                result = true;
            }
        }

        if (result) {
            return stringBuilder.toString();
        } else {
            return "\nThere is no any treasure in this range.";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public ArrayList<Treasure> getTreasures() {
        return this.treasures;
    }
}
