package com.company;

public enum TransportType {
    TRAIN,
    BUS,
    PLANE,
    SHIP,
    CAR;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
