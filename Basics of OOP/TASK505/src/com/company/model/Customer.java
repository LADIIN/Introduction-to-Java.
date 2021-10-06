package com.company.model;

import com.company.utils.Sweet;

public class Customer {
    private String name;
    private Present present;

    public Customer(String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return String.format("\nCustomer: %s\n%s\nWeight: %s\nPrice: %s", this.getName(),
                this.getPresent(), Double.toString(this.getPresent().getSweetsWeight()),
                Double.toString(this.calculateBill()));
    }

    public double calculateBill() {
        double sum = 0;

        for (Sweet sweet : this.present.getSweets()) {
            sum += sweet.getPrice();
        }

        return sum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "None";
        }
    }

    public Present getPresent() {
        return this.present;
    }

    public void setPresent(Present present) {
        this.present = present;
    }
}
