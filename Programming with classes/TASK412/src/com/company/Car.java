package com.company;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Car {
    private String model;
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private int amountWheels;
    private boolean isFuel;

    Car(String model, String engineType, int power, String tireType, int amountWheels) {
        this.setModel(model);
        this.engine = new Engine(engineType, power);
        this.setAmountWheels(amountWheels);
        this.setWheels(tireType);
        this.isFuel = true;
    }

    @Override
    public String toString() {
        return "\nCar model: " + this.getModel();
    }

    private void setWheels(String tireType) {
        this.wheels = new ArrayList<Wheel>(this.getAmountWheels());

        for (int i = 0; i < this.getAmountWheels(); i++) {
            this.wheels.add(new Wheel(tireType, false));
        }
    }

    public void changeWheel() {
        boolean anyPuncture = false;

        for (int i = 0; i < this.getAmountWheels(); i++) {
            if (this.wheels.get(i).isPuncture()) {
                anyPuncture = true;
                wheels.set(i, new Wheel(this.wheels.get(i).getTireType(), false));
                System.out.println("\nTire were successfully changed.");
            }
        }

        if (!anyPuncture) {
            System.out.println("\nThere is no tires with puncture to change.");
        }

    }

    public boolean isWheelsHavePuncture() {
        for (int i = 0; i < this.getAmountWheels(); i++) {
            if (this.wheels.get(i).isPuncture()) {
                return true;
            }
        }
        return false;
    }

    public void driveCar() {
        Random random = new Random();

        if (this.isFuel() && !isWheelsHavePuncture()) {
            System.out.println("\nYou drove for a while, but car ran out of fuel" +
                    " and seems a wheel has a puncture.");
            this.isFuel = false;
            this.wheels.get(random.nextInt(4)).setPuncture(true);
        } else {
            System.out.println("\nThere is no fuel in car or a wheel has a puncture.");
        }
    }

    public void refuelCar() {
        this.isFuel = true;
        System.out.println("\nCar was refueled.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFuel() {
        return isFuel;
    }

    public int getAmountWheels() {
        return amountWheels;
    }

    private void setAmountWheels(int amountWheels) {
        this.amountWheels = Math.abs(amountWheels);
    }
}
