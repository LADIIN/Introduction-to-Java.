package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class CustomersList {
    private String listName;
    private ArrayList<Customer> list;

    CustomersList(String listName, ArrayList<Customer> list) {
        this.setListName(listName);
        this.setList(list);
    }

    CustomersList() {
        this.setListName("");
        this.setList(new ArrayList<Customer>());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Customer costumer : list) {
            stringBuilder.append(costumer).append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortCustomersBySurname() {
        this.list.sort(Comparator.comparing(Customer::getSurname));
    }

    public String searchByCreditCardNumberInterval(BigInteger min, BigInteger max) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Customer customer : this.list) {
            if (customer.getCreditCardNumber().compareTo(min) > 0
                    && customer.getCreditCardNumber().compareTo(max) < 0) {
                stringBuilder.append(customer).append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public void addCustomer(Customer customer) {
        this.list.add(customer);
    }


    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setList(ArrayList<Customer> list) {
        this.list = list;
    }

    public String getListName() {
        return listName;
    }

    public ArrayList<Customer> getList() {
        return list;
    }
}
