package com.company;

import java.util.Date;

public class Airport {
    private String AirportTitle;
    private Airline[] airlines;

    Airport(String airportTitle, Airline[] airlines) {
        this.setAirportTitle(airportTitle);
        this.setAirlines(airlines);
    }

    Airport() {
        this.setAirportTitle("");
        this.setAirlines(new Airline[0]);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.AirportTitle).append(":\n");

        for (Airline airline : this.airlines) {
            stringBuilder.append(airline).append("\n");
        }

        return stringBuilder.toString();
    }

    public String searchByDestination(String request) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean result = false;

        for (Airline airline : this.airlines) {
            if (airline.getDestination().equals(request)) {
                stringBuilder.append(airline).append("\n");
                result = true;
            }
        }
        if (!result) {
            stringBuilder.append("\nThere is no request result.");
        }

        return stringBuilder.toString();
    }

    public String searchByDayOfWeek(String request) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean result = false;

        for (Airline airline : this.airlines) {
            for (String day : airline.getDays()) {
                if (day.equals(request)) {
                    stringBuilder.append(airline).append("\n");
                    result = true;
                }
            }
        }
        if (!result) {
            stringBuilder.append("\nThere is no request result.");
        }

        return stringBuilder.toString();
    }

    public String searchByDayAndTimeAbove(String dayRequest, Date time) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean result = false;

        for (Airline airline : this.airlines) {
            for (String day : airline.getDays()) {
                if (day.equals(dayRequest) && airline.getDepartureTime().compareTo(time) >= 0) {
                    stringBuilder.append(airline).append("\n");
                    result = true;
                }
            }
        }
        if (!result) {
            stringBuilder.append("\nThere is no request result.");
        }

        return stringBuilder.toString();
    }

    public void setAirportTitle(String airportTitle) {
        AirportTitle = airportTitle;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public String getAirportTitle() {
        return AirportTitle;
    }

    public Airline[] getAirlines() {
        return airlines;
    }
}
