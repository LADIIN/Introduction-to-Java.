package com.company;

//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

public class Main {

    public static void main(String[] args) {
        Point a = new Point(-1, -6);
        Point b = new Point(4, 9);
        Point c = new Point(5, 3);

        Triangle triangle = new Triangle(new Side(a, b), new Side(b, c), new Side(a, c));

        System.out.println(triangle.toString());
        System.out.println("\nPerimeter:" + triangle.calculatePerimeter()
                + "\nSquare: " + triangle.calculateSquare()
                + "\nPoint of median intersection: " + triangle.pointMedianIntersection().toString());


    }
}
