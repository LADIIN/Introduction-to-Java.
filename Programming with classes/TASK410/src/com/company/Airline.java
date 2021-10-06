package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
    private String destination;
    private int number;
    private String AirplaneType;
    private Date departureTime;
    private String[] days;

    static SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

    Airline(String destination, int number, String airplaneType, Date departureTime, String[] days) {
        this.setDestination(destination);
        this.setNumber(number);
        this.setAirplaneType(airplaneType);
        this.setDepartureTime(departureTime);
        this.setDays(days);
    }

    Airline() throws ParseException {
        this.setDestination("");
        this.setNumber(0);
        this.setAirplaneType("");
        this.setDepartureTime(formatter.parse("00:00"));
        this.setDays(days);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String day : this.getDays()) {
            stringBuilder.append(day).append(" ");
        }

        return "\nDestination: " + this.getDestination()
                + "\nNumber: " + this.getNumber()
                + "\nAirplane type: " + this.getAirplaneType()
                + "\nDeparture time: " + formatter.format(this.getDepartureTime())
                + "\nDays: " + stringBuilder.toString();
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAirplaneType(String airplaneType) {
        AirplaneType = airplaneType;
    }

    public void setNumber(int number) {
        this.number = Math.abs(number);
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public String getAirplaneType() {
        return AirplaneType;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public String[] getDays() {
        return days;
    }
}
