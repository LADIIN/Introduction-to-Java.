package com.company;

import java.util.ArrayList;


public class Bank {
    private String name;
    private ArrayList<Client> clients;

    Bank(String name) {
        this.setName(name);
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public Client getClient(int idRequest) {
        for (Client client : this.clients) {
            if (client.getId() == idRequest) {
                return client;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
