package com.company;

//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

public class Main {

    public static void main(String[] args) {
        City capital = new City("Minsk");
        Country country = new Country("Belarus", capital);

        country.addRegion(new Region("Brestkaya oblast",
                new City("Brest"), 32.787));
        country.addRegion(new Region("Minskaya oblast",
                capital, 39.854));
        country.addRegion(new Region("Vitebskaya oblast oblast",
                new City("Vitebsk"), 40.051));
        country.addRegion(new Region("Gomelskaya oblast",
                new City("Gomel"), 40.372));
        country.addRegion(new Region("Grondnenskaya oblast",
                new City("Grodno"), 25.127));
        country.addRegion(new Region("Mogilevskaya oblast",
                new City("Mogilev"), 29.068));

        System.out.println(country);

        System.out.println("Area: " + country.getArea() + " km"
                + "\nNumber of regions: " + country.getNumberOfRegions()
                + "\nRegional centers:\n" + country.getRegionalCenters());

    }
}
