package com.company;

//Создайте класс  Train, содержащий  поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте  возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте  возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

public class Main {

    public static void main(String[] args) {
        Train[] trains = new Train[5];

        trains[0] = new Train("Minsk", 725, 6.25);
        trains[1] = new Train("Brest", 728, 14.58);
        trains[2] = new Train("Orsha", 639, 15.40);
        trains[3] = new Train("Moscow", 103, 9.00);
        trains[4] = new Train("Brest", 507, 20.45);

        System.out.println("\nTrains sorted by number:");
        Train.sortTrainsByNumber(trains);

        for (Train train : trains) {
            System.out.println(train);
        }

        System.out.println("\nTrains sorted by destination:");
        Train.sortTrainsByDestination(trains);

        for (Train train : trains) {
            System.out.println(train);
        }

        System.out.println("\nResult of search by number: " + Train.searchTrainByNumber(trains, 103));

    }
}
