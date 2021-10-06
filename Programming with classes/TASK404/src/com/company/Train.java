package com.company;

public class Train {
    private String destination;
    private int number;
    private double departureTime;

    Train(String destination, int number, double departureTime) {
        this.setDestination(destination);
        this.setNumber(number);
        this.setDepartureTime(departureTime);
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDepartureTime(double departureTime) {
        departureTime = (departureTime > 0) ? departureTime : -departureTime;

        if ((int) departureTime <= 24 && (int) departureTime >= 0
                && departureTime - (int) departureTime < 60
                && departureTime - (int) departureTime >= 0) {
            this.departureTime = departureTime;
        } else {
            this.departureTime = 0;
        }
    }

    public String getDestination() {
        return this.destination;
    }

    public int getNumber() {
        return this.number;
    }

    public double getDepartureTime() {
        return this.departureTime;
    }

    @Override
    public String toString() {
        return "\nDestination: " + this.destination + "\nNumber: " + this.number
                + "\nDeparture time: " + this.departureTime;
    }

    public static void sortTrainsByNumber(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].number > trains[j].number) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    public static String searchTrainByNumber(Train[] trains, int numberRequest) {
        for (Train train : trains) {
            if (train.number == numberRequest) {
                return train.toString();
            }
        }
        return "\nThere is no train with such number.";
    }

    public static void sortTrainsByDestination(Train[] trains) {
        Train temp;
        int result;

        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                result = trains[i].destination.compareToIgnoreCase(trains[j].destination);

                if (result > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (result == 0) {
                    if (trains[i].departureTime > trains[j].departureTime) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
    }

}
