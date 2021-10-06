package com.company;

public class TourVoucher {
    private TourType type;
    private String country;
    private String city;
    private TransportType transport;
    private FoodType meal;
    private int days;
    private double price;

    TourVoucher(TourType type, String country, String city,
                TransportType transport, FoodType meal, int days, double price) {
        this.setType(type);
        this.setCountry(country);
        this.setCity(city);
        this.setTransport(transport);
        this.setMeal(meal);
        this.setDays(days);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return "\nType: " + this.getType() + "\nCountry: " + this.getCountry() + "\nCity: " + this.getCity()
                + "\nTransport: " + this.getTransport() + "\nMeal: " + this.getMeal() + "\nDays: " + this.getDays()
                + "\nPrice: " + this.getPrice();
    }

    public TourType getType() {
        return type;
    }

    public void setType(TourType type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TransportType getTransport() {
        return transport;
    }

    public void setTransport(TransportType transport) {
        this.transport = transport;
    }

    public FoodType getMeal() {
        return meal;
    }

    public void setMeal(FoodType meal) {
        this.meal = meal;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = Math.abs(days);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.abs(price);
    }
}
