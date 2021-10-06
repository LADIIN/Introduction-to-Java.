package com.company;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и
//произвольными  значениями. Счетчик  имеет  методы увеличения  и  уменьшения состояния, и  метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Counter {
    private int value;
    private int minValue;
    private int maxValue;

    Counter(int value, int minValue, int maxValue) {
        this.setValue(value);
        this.setMinValue(minValue);
        this.setMaxValue(maxValue);
    }

    Counter() {
        this.value = 0;
        this.minValue = 0;
        this.maxValue = 100;
    }

    public String toString() {
        return "\nValue: " + this.value + "\nMinValue: " + this.minValue + "\nMaxValue: " + this.maxValue;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void increaseValue() {
        if (this.value < maxValue && this.value >= minValue) {
            value++;
            System.out.println("Value increased to " + this.value);
        } else {
            System.out.println("Value is out of range.");
        }
    }

    public void decreaseValue() {
        if (this.value <= maxValue && this.value > minValue) {
            value--;
            System.out.println("Value decreased to " + this.value);
        } else {
            System.out.println("Value is out of range.");
        }
    }

}
