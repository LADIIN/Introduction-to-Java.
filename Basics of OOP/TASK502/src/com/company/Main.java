package com.company;

//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
//нескольких товаров

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Milk", 2.7));
        products.add(new Product("Cookies", 3.1));
        products.add(new Product("Apples", 2.5));
        products.add(new Product("Yogurt", 1.7));

        Payment payment = new Payment(products);

        System.out.println(payment);

    }
}
