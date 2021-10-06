package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {
    private static int basicID;
    private String fullname;
    private int id;
    private ArrayList<TourVoucher> offers;

    public Client(String fullname) {
        this.setId(basicID++);
        this.setFullname(fullname);
        this.offers = new ArrayList<>();
    }

    public String getClientOffers() {
        StringBuilder stringBuilder = new StringBuilder();

        for (TourVoucher offer : this.getOffers()) {
            stringBuilder.append(offer).append("\n");
        }
        return stringBuilder.toString();
    }

    public void addOffers(ArrayList<TourVoucher> offers) {
        this.getOffers().addAll(offers);
    }

    public void sortClientOffersByPrice() {
        this.getOffers().sort(Comparator.comparing(TourVoucher::getPrice));
    }

    public void sortClientOffersByDays() {
        this.getOffers().sort(Comparator.comparing(TourVoucher::getDays));
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public ArrayList<TourVoucher> getOffers() {
        return offers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
