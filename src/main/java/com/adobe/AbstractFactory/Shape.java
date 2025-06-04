package com.adobe.AbstractFactory;

public interface Shape {
    public void draw();
}

 class Square implements Shape{

        @Override
        public void draw() {
            System.out.println("this is square");
        }
    }