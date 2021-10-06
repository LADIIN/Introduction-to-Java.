package com.company.utils;

public enum Rarity {
    COMMON,     // 0
    UNUSUAL,    // 1
    RARE,       // 2
    EPIC,       // 3
    LEGENDARY;  // 4

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
