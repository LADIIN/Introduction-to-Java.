package com.company;

public class Account {
    private static int basicID = 0;
    private int id;
    private double balance;
    private boolean isOpen = true;

    Account(double balance) {
        this.id = basicID++;
        this.setBalance(balance);
        this.setOpen(true);
    }

    @Override
    public String toString() {
        return "\nID: " + this.getId()
                + "\nBalance: " + this.getBalance()
                + "\nIs open: " + this.isOpen();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (this.isOpen) {
            this.balance = balance;
        } else {
            System.out.println("\nThis account is blocked.");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getId() {
        return id;
    }
}
