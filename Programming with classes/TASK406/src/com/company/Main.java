package com.company;

//Составьте  описание класса для представления времени. Предусмотрте  возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на
//заданное количество часов, минут и секунд.

public class Main {

    public static void main(String[] args) {
        Time time = new Time(21, 13, 17);

        System.out.println(time);

        time.setSeconds(67);
        System.out.println(time);

        time.setMinutes(-89);
        System.out.println(time);

        time.setHours(24);
        System.out.println(time);

        time.addHours(56);
        System.out.println(time);

        time.addMinutes(65);
        System.out.println(time);

        time.addSeconds(-50);
        System.out.println(time);

    }
}
