package com.company;

import java.util.ArrayList;

public class Country {
    private String countryName;
    private City capital;
    private ArrayList<Region> regions;

    Country(String countryName, City capital) {
        this.setCountryName(countryName);
        this.setCapital(capital);
        this.regions = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nCountry: " + getCountryName()
                + "\nCapital:" + getCapital();
    }

    public void addRegion(Region region) {
        this.regions.add(region);
    }

    public double getArea() {
        double area = 0;

        for (Region region : regions) {
            area += region.getArea();
        }

        return area;
    }

    public int getNumberOfRegions() {
        return this.regions.size();
    }

    public String getRegionalCenters() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Region region : this.regions) {
            stringBuilder.append(region.getRegionCenter()).append("\n");
        }
        return stringBuilder.toString();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
}
