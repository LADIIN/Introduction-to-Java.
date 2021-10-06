package com.company;

import java.util.ArrayList;

public class TravelAgency {
    private String agencyName;
    private ArrayList<TourVoucher> vouchers;
    private ArrayList<Client> clients;

    TravelAgency(String agencyName) {
        this.setAgencyName(agencyName);
        this.vouchers = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public void addVoucher(TourVoucher voucher) {
        this.getVouchers().add(voucher);
    }

    public void addClient(Client client) {
        this.getClients().add(client);
    }

    public Client getClient(int idRequest) {
        for (Client client : this.getClients()) {
            if (client.getId() == idRequest) {
                return client;
            }
        }
        return null;
    }

    public String getVouchersInfo() {
        StringBuilder stringBuilder = new StringBuilder();

        for (TourVoucher voucher : this.getVouchers()) {
            stringBuilder.append(voucher).append("\n");
        }
        return stringBuilder.toString();
    }

    public ArrayList<TourVoucher> selectVouchers(TourType type) {
        ArrayList<TourVoucher> offers = new ArrayList<>();

        for (TourVoucher voucher : this.getVouchers()) {
            if (voucher.getType() == type) {
                offers.add(voucher);
            }
        }
        return offers;
    }

    public ArrayList<TourVoucher> selectVouchers(TourType type, TransportType transportType) {
        ArrayList<TourVoucher> offers = new ArrayList<>();

        for (TourVoucher voucher : this.getVouchers()) {
            if (voucher.getType() == type && voucher.getTransport() == transportType) {
                offers.add(voucher);
            }
        }
        return offers;
    }

    public ArrayList<TourVoucher> selectVouchers(TourType type, TransportType transportType, FoodType meal) {
        ArrayList<TourVoucher> offers = new ArrayList<>();

        for (TourVoucher voucher : this.getVouchers()) {
            if (voucher.getType() == type && voucher.getTransport() == transportType
                    && voucher.getMeal() == meal) {
                offers.add(voucher);
            }
        }
        return offers;
    }

    public ArrayList<TourVoucher> selectVouchers(TourType type, TransportType transportType, FoodType meal, int days) {
        ArrayList<TourVoucher> offers = new ArrayList<>();

        for (TourVoucher voucher : this.getVouchers()) {
            if (voucher.getType() == type && voucher.getTransport() == transportType
                    && voucher.getMeal() == meal && voucher.getDays() == days) {
                offers.add(voucher);
            }
        }
        return offers;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ArrayList<TourVoucher> getVouchers() {
        return vouchers;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
}
