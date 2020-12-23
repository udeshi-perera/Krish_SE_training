package com.shape;

public class Triangle extends Shape {
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                '}';
    }
}
