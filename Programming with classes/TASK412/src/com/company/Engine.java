package com.company;

public class Engine {
    private String model;
    private int power;

    Engine(String model, int power) {
        this.setModel(model);
        this.setPower(power);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
