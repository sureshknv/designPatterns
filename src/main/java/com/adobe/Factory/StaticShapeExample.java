package com.adobe.Factory;

public class StaticShapeExample {

    public static void main(String[] args){

        Shape shape= StaticShapeFactory.getShape("Rectangle");
        System.out.println("rectangle area is "+ shape.calculateArea());
    }
}
