package com.company;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Porsche", "V6", 320, "Summer", 4);

        System.out.println(car);
        car.driveCar();
        car.driveCar();

        car.refuelCar();
        car.changeWheel();

        car.driveCar();
    }
}
