package com.company;

public class Test2 {
    private int a;
    private int b;

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Test2() {
        this.a = 1;
        this.b = 1;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "a = " + this.a + "\nb = " + this.b;
    }

}
