package com.adobe.Factory;

public interface Shape {
    public long calculateArea();
}


class Rectangle implements  Shape{
    private long length;
    private long breadth;

    public Rectangle() {

    }

    @Override
    public long calculateArea() {
        return length* breadth;
    }
    public Rectangle(long length, long breadth){
        this.length=length;
        this.breadth=breadth;
    }
}
class Circle implements Shape{
    private long radius;

    Circle(long radius){
        this.radius=radius;

    }
    @Override
    public  long calculateArea(){
        return this.radius*this.radius*(22/7);
    }
}