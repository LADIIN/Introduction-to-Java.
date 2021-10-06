package com.company;

class Side {
    private Point a;
    private Point b;

    Side(Point a, Point b) {
        this.setA(a);
        this.setB(b);
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    double calculateSide() {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
