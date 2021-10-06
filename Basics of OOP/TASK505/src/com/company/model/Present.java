package com.company.model;

import com.company.utils.Sweet;
import com.company.utils.Wrap;

import java.util.ArrayList;

public class Present {
    private String recipient;
    private ArrayList<Sweet> sweets;
    private Wrap wrap;
    private double price;

    public Present(String recipient, ArrayList<Sweet> sweets, Wrap wrap) {
        this.setRecipient(recipient);
        this.setSweets(sweets);
        this.setWrap(wrap);
    }

    @Override
    public String toString() {
        return String.format("Present recipient: %s\n\nSweets:\n%s\nWrap: %s\n",
                this.getRecipient(), this.getListOfSweets(), this.getWrap());
    }

    public String getListOfSweets() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Sweet sweet : this.getSweets()) {
            stringBuilder.append(sweet);
        }

        return stringBuilder.toString();
    }

    public double getSweetsWeight() {
        double weight = 0;

        for (Sweet sweet : this.sweets) {
            weight += sweet.getWeight();
        }

        return weight;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public void setRecipient(String recipient) {
        if (!recipient.isEmpty()) {
            this.recipient = recipient;
        } else {
            this.recipient = "None";
        }
    }

    public ArrayList<Sweet> getSweets() {
        return this.sweets;
    }

    public void setSweets(ArrayList<Sweet> sweets) {
        this.sweets = sweets;
    }

    public Wrap getWrap() {
        return this.wrap;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }
}
