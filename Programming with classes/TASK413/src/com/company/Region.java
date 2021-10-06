package com.company;

import java.util.ArrayList;

public class Region {
    private String regionName;
    private City regionCenter;
    private double area;
    private ArrayList<District> districts;

    Region(String regionName, City regionCenter, double area) {
        this.setRegionName(regionName);
        this.setRegionCenter(regionCenter);
        this.setArea(area);
        this.districts = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nRegion name: " + this.getRegionName()
                + "\nRegion center: " + this.getRegionCenter();
    }

    public void addDistrict(District district) {
        this.districts.add(district);
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
