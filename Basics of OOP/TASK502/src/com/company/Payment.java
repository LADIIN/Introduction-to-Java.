package com.company;

import java.util.ArrayList;

public class Payment {
    private double totalAmount;
    private String productList;

    Payment(ArrayList<Product> products) {
        Receipt receipt = new Receipt(products);
        this.setTotalAmount(receipt.calculateAmount());
        this.setProductList(receipt.getProductsList());
    }

    @Override
    public String toString() {
        return "Payment:\n" + this.getProductList() + "\nTotal amount: " + this.getTotalAmount();
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getProductList() {
        return this.productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public static class Receipt {
        private ArrayList<Product> products;
        private double amount;

        Receipt(ArrayList<Product> products) {
            this.setProducts(products);

        }

        Receipt() {
            this.setProducts(new ArrayList<>());
            this.amount = 0;
        }

        public double calculateAmount() {
            double amount = 0;

            for (Product product : this.getProducts()) {
                amount += product.getPrice();
            }
            return amount;
        }

        public ArrayList<Product> getProducts() {
            return products;
        }

        public String getProductsList() {
            StringBuilder stringBuilder = new StringBuilder();

            for (Product product : this.getProducts()) {
                stringBuilder.append(product);
            }
            return stringBuilder.toString();
        }

        public void setProducts(ArrayList<Product> products) {
            this.products = products;
        }

        public double getAmount() {
            return this.amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }


}
