package com.company;

import java.util.ArrayList;

public class District {
    private String districtName;
    private ArrayList<City> cities;

    District(String districtName) {
        this.setDistrictName(districtName);
        this.cities = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.getDistrictName();
    }

    public void addCity(City city) {
        this.cities.add(city);
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
