package com.shape;

public class Application {

    public static void main(String[] args) {
        Registry registry=new Registry();

        Triangle triangle= (Triangle) registry.getShape(ShapeType.TRIANGLE);
        System.out.println(triangle);

        triangle.setBase(5);

        System.out.println(triangle);

        Triangle newTriangle= (Triangle) registry.getShape(ShapeType.TRIANGLE);
        System.out.println(newTriangle);
    }
}
