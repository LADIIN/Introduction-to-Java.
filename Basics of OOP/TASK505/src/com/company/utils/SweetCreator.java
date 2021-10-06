package com.company.utils;

import java.util.ArrayList;
import java.util.Random;

public class SweetCreator {
    public static Sweet createSweet() {
        Random random = new Random();
        String[] candies = {"Alenka", "Rafaello", "BimBom", "Shokolapki", "Dushes", "Impresso", "Pchelka", "Spartak"};
        String[] cookies = {"Oreo", "Slodich", "Lovita", "Esmeralda", "MultiCake", "Lyubyatovo"};

        double weight = (Math.random() * ((10 - 1) + 1)) + 1;
        weight = Math.round(weight * 10.0) / 10.0;

        double price = (Math.random() * ((10 - 1) + 1)) + 1;
        price = Math.round(price * 10.0) / 10.0;

        switch (random.nextInt(2) + 1) {
            case 1:
                return new Candy(candies[random.nextInt(candies.length)], weight, price);
            case 2:
                return new Cookie(cookies[random.nextInt(cookies.length)], weight, price);
            default:
                return null;
        }
    }

    public static ArrayList<Sweet> createSweetsList(int amount) {
        ArrayList<Sweet> sweets = new ArrayList<>(amount);

        for (int i = 0; i < amount; i++) {
            sweets.add(createSweet());
        }
        return sweets;
    }

}
