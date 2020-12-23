package com.shape;

public class Rectangle extends Shape {

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                '}';
    }
}
