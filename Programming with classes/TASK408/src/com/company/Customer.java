package com.company;

import java.math.BigInteger;

public class Customer {
    private static int basicID = 0;

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private BigInteger creditCardNumber;
    private long bankAccountNumber;

    Customer(String surname, String name, String patronymic,
             String address, BigInteger creditCardNumber, long bankAccountNumber) {
        this.setId(basicID++);
        this.setSurname(surname);
        this.setName(name);
        this.setPatronymic(patronymic);
        this.setAddress(address);
        this.setCreditCardNumber(creditCardNumber);
        this.setBankAccountNumber(bankAccountNumber);
    }

    Customer() {
        this.setId(basicID++);
        this.setSurname("");
        this.setName("");
        this.setPatronymic("");
        this.setAddress("");
        this.setCreditCardNumber(new BigInteger("0"));
        this.setBankAccountNumber(0);
    }

    @Override
    public String toString() {
        return "ID:\t" + this.getId()
                + "\nSurname: " + this.getSurname()
                + "\nName: " + this.getName()
                + "\nPatronymic: " + this.getPatronymic()
                + "\nAddress: " + this.getAddress()
                + "\nCredit card number: " + this.getCreditCardNumber()
                + "\nBank account number: " + this.getBankAccountNumber() + "\n";
    }

    public void setId(int id) {
        this.id = Math.abs(id);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = Math.abs(bankAccountNumber);
    }

    public void setCreditCardNumber(BigInteger creditCardNumber) {
        this.creditCardNumber = creditCardNumber.abs();
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public BigInteger getCreditCardNumber() {
        return creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }
}
