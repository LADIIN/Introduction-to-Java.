package com.company;

//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

public class Main {

    public static void main(String[] args) {
        TravelAgency agency = new TravelAgency("Horizon");

        agency.addVoucher(new TourVoucher(TourType.CRUISE, "Sweden", "Stockholm",
                TransportType.SHIP, FoodType.ALL_INCLUDED, 14, 900.55));

        agency.addVoucher(new TourVoucher(TourType.SHOPPING, "Italy", "Milan",
                TransportType.PLANE, FoodType.NOT_INCLUDED, 2, 150.55));

        agency.addVoucher(new TourVoucher(TourType.SHOPPING, "German", "Frankfurt",
                TransportType.PLANE, FoodType.NOT_INCLUDED, 3, 130.55));

        System.out.println("All tour vouchers:\n" + agency.getVouchersInfo());

        agency.addClient(new Client("Ivanov Ivan Ivanovich"));

        Client client = agency.getClient(0);

        client.addOffers(agency.selectVouchers(TourType.SHOPPING, TransportType.PLANE, FoodType.NOT_INCLUDED));
        client.sortClientOffersByPrice();

        System.out.println("Result of client selection and sort by price: \n" + client.getClientOffers());
    }
}
