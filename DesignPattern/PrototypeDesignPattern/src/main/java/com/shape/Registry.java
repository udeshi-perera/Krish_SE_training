package com.shape;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public Registry() {
        //this.shape = shape;

        this.assignValues();
    }

    public Shape getShape(ShapeType shapeType){
        Shape shape=null;
        try{
            shape=(Shape) shapes.get(shapeType).clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException){
            System.out.println("Clone not supported exception");
        }
        return shape;
    }

    private void assignValues() {

        //use new keyword when only initialize
        Triangle triangle=new Triangle();
        triangle.setBase(3);
        triangle.setColour("Blue");
        triangle.setWidth(4);

        Rectangle rectangle=new Rectangle();
        rectangle.setHeight(2);
        rectangle.setColour("Red");
        rectangle.setWidth(4);

        shapes.put(ShapeType.TRIANGLE,triangle);
        shapes.put(ShapeType.RECTANGLE,rectangle);
    }
}
