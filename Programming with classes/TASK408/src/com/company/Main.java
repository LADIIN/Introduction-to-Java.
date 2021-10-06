package com.company;

/*
    Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
    и методами. Задать критерии выбора данных и вывести эти данные на консоль.

    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    Найти и вывести:
    a) список покупателей в алфавитном порядке;
    b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CustomersList list = new CustomersList("Clients", new ArrayList<>());

        list.addCustomer(new Customer("Ivanov", "Ivan", "Ivanovich",
                "Minsk", new BigInteger("1234567891235567"), 123456789));
        list.addCustomer(new Customer("Kravic", "Stanislav", "Sergeevich",
                "Grodno", new BigInteger("1111111111111111"), 987654321));
        list.addCustomer(new Customer("Bodrov", "Sergei", "Vladimirovich",
                "Brest", new BigInteger("2222222222222222"), 123498765));
        list.addCustomer(new Customer("Liskova", "Elizavetha", "Valentinovna",
                "Minsk", new BigInteger("3333333333333333"), 987651234));
        list.addCustomer(new Customer("Vasnicova", "Olga", "Nikolaevna",
                "Brest", new BigInteger("4444444444444444"), 333444666));

        System.out.println(list.getListName() + "\n\n" + list);

        list.sortCustomersBySurname();
        System.out.println("Customers in alphabetic order:\n\n" + list);

        System.out.println("Customers with credit card number in chosen in interval:\n\n"
                + list.searchByCreditCardNumberInterval(new BigInteger("1111111111111111"),
                new BigInteger("4444444444444444")));

    }
}
