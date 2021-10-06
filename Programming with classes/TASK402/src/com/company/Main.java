package com.company;

//Создйте класс  Test2 двумя  переменными.  Добавьте конструктор  с  входными  параметрами.  Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//класса.

public class Main {

    public static void main(String[] args) {
        Test2 test = new Test2();
        System.out.println("Uninitialized object:\n" + test);

        Test2 test2 = new Test2(5, 13);
        System.out.println("Initialized object:\n" + test2);
    }
}
