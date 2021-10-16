package com.company.utils;

public enum BookType {
    PAPERBOOK("Paper book"),
    EBOOK("Electronic book"),
    NONE("None");

    private String type;

    BookType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }

    public String getType() {
        return this.type;
    }

}
