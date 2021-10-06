package com.company.view;

import com.company.model.Customer;
import com.company.model.Present;
import com.company.utils.SweetCreator;
import com.company.utils.Wrap;

import java.util.Scanner;

public class Menu {

    public static void runMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! How I can call you?");
        String name = scanner.nextLine();

        Customer customer = new Customer(name);

        System.out.println("\nWho is recipient?");
        String recipient = scanner.nextLine();

        System.out.println("\nHow much sweets you want to put in?");
        String sweetsAmount = scanner.nextLine();

        if (!sweetsAmount.matches("(?<![-.])\\b[0-9]+\\b(?!\\.[0-9])")) {
            System.out.println("\nAmount of sweets must be positive integer.");
        } else {
            System.out.println("\nWhat color of wrap you want?");
            String color = scanner.nextLine();

            System.out.println("\nWhat material of wrap you want?");
            String material = scanner.nextLine();

            customer.setPresent(new Present(recipient, SweetCreator.createSweetsList(Integer.parseInt(sweetsAmount)),
                    new Wrap(color, material)));

            System.out.println(customer);
        }
    }


}
