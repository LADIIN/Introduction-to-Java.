package com.company;

import java.util.Locale;

public enum TourType {
    RECREATION,
    EXCURSION,
    TREATMENT,
    SHOPPING,
    CRUISE;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
