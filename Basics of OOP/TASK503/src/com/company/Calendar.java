package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Calendar {
    private int year;
    private ArrayList<Holiday> holidays;

    Calendar(int year) {
        this.setYear(year);
        this.setHolidays(new ArrayList<Holiday>());
    }

    public void addHoliday(LocalDate date, String holidayName) {
        this.getHolidays().add(new Holiday(date, holidayName));
    }

    public void deleteHoliday(String holidayName) {
        this.getHolidays().removeIf(holiday -> holiday.getHolidayName().equals(holidayName));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Holidays calendar of ").append(this.year).append(" year\n");

        for (Holiday holiday : this.getHolidays()) {
            stringBuilder.append(holiday).append("\n");
        }
        return stringBuilder.toString();
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = Math.abs(year);
    }

    public ArrayList<Holiday> getHolidays() {
        return this.holidays;
    }

    public void setHolidays(ArrayList<Holiday> holidays) {
        this.holidays = holidays;
    }

    public static class Holiday {

        private LocalDate date;

        private String holidayName;

        Holiday(LocalDate date, String holidayName) {
            this.setDate(date);
            this.setHolidayName(holidayName);
        }

        @Override
        public String toString() {
            return "\nName:" + this.getHolidayName() +
                    "\nDate: " + this.getDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }

        public LocalDate getDate() {
            return this.date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getHolidayName() {
            return this.holidayName;
        }

        public void setHolidayName(String holidayName) {
            this.holidayName = holidayName;
        }

    }
}
