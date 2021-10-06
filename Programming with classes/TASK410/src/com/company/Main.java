package com.company;

/*
    Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
    методами. Задать критерии выбора данных и вывести эти данные на консоль.

    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
    Найти и вывести:
    a) список рейсов для заданного пункта назначения;
    b) список рейсов для заданного дня недели;
    c) список рейсов для заданного дня недели, время вылета для которых больше заданного
 */

import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        Airline[] airlines = new Airline[5];

        airlines[0] = new Airline("Warsaw", 971, "Boeing 737-300",
                Airline.formatter.parse("14:40"), new String[]{"Monday", "Thursday", "Sunday"});
        airlines[1] = new Airline("Berlin", 178, "Embraer 175",
                Airline.formatter.parse("21:30"), new String[]{"Wednesday", "Friday", "Saturday"});
        airlines[2] = new Airline("Brussels", 799, "Embraer 175",
                Airline.formatter.parse("5:30"), new String[]{"Monday", "Thursday", "Friday", "Sunday"});
        airlines[3] = new Airline("Brussels", 459, "Airbus 380",
                Airline.formatter.parse("15:10"), new String[]{"Thursday", "Friday", "Sunday"});
        airlines[4] = new Airline("Moscow", 567, "Airbus А321",
                Airline.formatter.parse("12:55"), new String[]{"Wednesday", "Friday", "Saturday"});

        Airport airport = new Airport("Minsk National Airport", airlines);

        System.out.println(airport);

        String destination = "Brussels";
        String dayRequest = "Monday";
        Date timeRequest = Airline.formatter.parse("9:00");

        System.out.println("\nAirlines with destination - " + destination + ":\n"
                + airport.searchByDestination(destination)
                + "\nAirlines at - " + dayRequest + ":\n" + airport.searchByDayOfWeek(dayRequest)
                + "\nAirlines at - " + dayRequest + " and after " + Airline.formatter.format(timeRequest) + ":\n"
                + airport.searchByDayAndTimeAbove(dayRequest, timeRequest));

    }
}
