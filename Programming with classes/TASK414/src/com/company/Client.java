package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {
    private static int basicID;
    private String surname;
    private String name;
    private String patronymic;
    private int id;
    private ArrayList<Account> accounts;

    Client(String surname, String name, String patronymic) {
        this.setSurname(surname);
        this.setName(name);
        this.setPatronymic(patronymic);
        this.id = basicID++;
        this.accounts = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nClient ID - " + this.getId() +
                "\nSurname: " + this.getSurname() +
                "\nName: " + this.getName() +
                "\nPatronymic: " + this.getPatronymic() +
                "\nBalance: " + this.getClientBalance() +
                "\nPositive balance: " + this.getPositiveBalance() +
                "\nNegative balance: " + this.getNegativeBalance();
    }

    public void createAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(int idRequest) {
        for (Account account : this.accounts) {
            if (account.getId() == idRequest) {
                return account;
            }
        }

        return null;
    }

    public void sortAccountsByBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public String getAccountsInfo() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Account account : this.accounts) {
            stringBuilder.append(account);
        }
        return stringBuilder.toString();
    }

    public double getClientBalance() {
        double balance = 0;

        for (Account account : this.accounts) {
            if (account.isOpen()) {
                balance += account.getBalance();
            }
        }

        double scale = Math.pow(10, 2);

        return Math.ceil(balance * scale) / scale;
    }

    public double getPositiveBalance() {
        double balance = 0;

        for (Account account : this.accounts) {
            if (account.isOpen() && account.getBalance() > 0) {
                balance += account.getBalance();
            }
        }

        double scale = Math.pow(10, 2);

        return Math.ceil(balance * scale) / scale;
    }

    public double getNegativeBalance() {
        double balance = 0;

        for (Account account : this.accounts) {
            if (account.isOpen() && account.getBalance() < 0) {
                balance += account.getBalance();
            }
        }

        double scale = Math.pow(10, 2);

        return Math.ceil(balance * scale) / scale;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


    public int getId() {
        return id;
    }
}
