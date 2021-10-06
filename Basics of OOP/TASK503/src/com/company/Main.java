package com.company;

//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        int year = 2021;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        Calendar calendar = new Calendar(2021);

        calendar.addHoliday(LocalDate.parse("01.01." + year, dtf), "New Year");
        calendar.addHoliday(LocalDate.parse("08.03." + year, dtf), "International Women's Day");
        calendar.addHoliday(LocalDate.parse("09.05." + year, dtf), "Victory Day");

        System.out.println(calendar);


    }
}
