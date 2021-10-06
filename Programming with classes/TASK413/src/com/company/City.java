package com.company;

public class City {

    private String name;

    City(String name) {
        this.setName(name);
    }


    @Override
    public String toString() {
        return this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
