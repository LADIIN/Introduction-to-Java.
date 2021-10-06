package com.company;

public class Triangle {
    private Side a;
    private Side b;
    private Side c;

    Triangle(Side a, Side b, Side c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    public void setA(Side a) {
        this.a = a;
    }

    public void setB(Side b) {
        this.b = b;
    }

    public void setC(Side c) {
        this.c = c;
    }

    public Side getA() {
        return a;
    }

    public Side getB() {
        return b;
    }

    public Side getC() {
        return c;
    }

    @Override
    public String toString() {
        return "A = " + this.a.calculateSide()
                + "\nB = " + this.b.calculateSide()
                + "\nC = " + this.c.calculateSide();
    }

    public double calculatePerimeter() {
        double a = this.a.calculateSide();
        double b = this.b.calculateSide();
        double c = this.c.calculateSide();

        if (a + b > c && a + c > b && b + c > a) {
            return a + b + c;
        }
        return 0;
    }

    public double calculateSquare() {
        double a = this.a.calculateSide();
        double b = this.b.calculateSide();
        double c = this.c.calculateSide();

        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        return 0;
    }

    public Point pointMedianIntersection() {
        double a = this.a.calculateSide();
        double b = this.b.calculateSide();
        double c = this.c.calculateSide();

        if (a + b > c && a + c > b && b + c > a) {
            double x = (this.a.getA().getX() + this.a.getB().getX() + this.b.getB().getX()) / 3;
            double y = (this.a.getA().getY() + this.a.getB().getY() + this.a.getB().getY()) / 3;

            return new Point(x, y);
        }
        return new Point(0, 0);
    }

}

