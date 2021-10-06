package com.company;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter);

        Counter counter1 = new Counter(5, 0, 10);
        System.out.println(counter1);
        counter1.increaseValue();
        counter1.decreaseValue();

    }
}
