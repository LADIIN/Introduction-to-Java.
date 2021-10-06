package com.company;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("We Buy Money Bank");

        Client client = new Client("Ivanov", "Ivan", "Ivanovich");

        client.createAccount(new Account(1000.67));
        client.createAccount(new Account(-100.34));
        client.createAccount(new Account(500.94));
        client.createAccount(new Account(200.12));

        bank.addClient(client);

        Client currentClient = bank.getClient(0);

        System.out.println(currentClient);

        currentClient.sortAccountsByBalance();

        System.out.println("\nAll accounts: " + currentClient.getAccountsInfo());

        System.out.println("\nSearch result: " + currentClient.getAccount(2));
    }
}
