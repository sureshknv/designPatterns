package com.adobe.AbstractFactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is Circle");
        return;
    }
}
