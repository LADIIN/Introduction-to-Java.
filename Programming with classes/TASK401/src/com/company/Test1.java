package com.company;

public class Test1 {
    private int a;
    private int b;

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

    public int sumVariables() {
        return this.a + this.b;
    }

    public int findMax() {
        return Math.max(this.a, this.b);
    }

    @Override
    public String toString() {
        return "a = " + this.a + "\nb = " + this.b;
    }

}
