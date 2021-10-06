package com.company;

import java.util.Locale;

public enum FoodType {
    NOT_INCLUDED,
    BREAKFAST,
    ALL_INCLUDED;

    @Override
    public String toString() {
        return super.toString().replaceAll("_", " ").toLowerCase();
    }
}
