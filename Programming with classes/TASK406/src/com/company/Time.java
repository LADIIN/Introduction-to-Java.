package com.company;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int hours, int minutes, int seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    @Override
    public String toString() {
        return this.hours + " : " + this.minutes + " : " + this.seconds;
    }

    public void setHours(int hours) {
        if (hours < 24 && hours > 0) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes < 60 && minutes > 0) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds < 60 && seconds > 0) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void addHours(int hours) {
        this.hours = (this.hours + hours) % 24;
        if (this.hours < 0) {
            this.hours += 24;
        }
    }

    public void addMinutes(int minutes) {
        if ((this.minutes + minutes) < 0) {
            addHours(minutes / 60 - 1);
            this.minutes = 60 + ((this.minutes + minutes) % 60);
        } else {
            addHours((this.minutes + minutes) / 60);
            this.minutes = (this.minutes + minutes) % 60;
        }
    }

    public void addSeconds(int seconds) {
        if ((this.seconds + seconds) < 0) {
            addMinutes(seconds / 60 - 1);
            this.seconds = 60 + ((this.seconds + seconds) % 60);
        } else {
            addMinutes((this.seconds + seconds) / 60);
            this.seconds = (this.seconds + seconds) % 60;
        }
    }

}
