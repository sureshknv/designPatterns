package com.adobe.Factory;

public class ShapeFactoryClient {

    public static void main(String[] args){
        ShapeFactory sf= new ShapeFactory();
       Shape shape= sf.getShape("Rectangle");
        System.out.println("rectangle area is "+ shape.calculateArea());
    }
}
