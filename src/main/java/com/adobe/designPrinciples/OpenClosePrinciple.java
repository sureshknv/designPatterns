package com.adobe.designPrinciples;
// here we have 2 principles used implement to an interface
// delegation principle like actual implementation of area is delegated
//open close principle. - open for extension closed for modification any number of shapes can implement shape class but areaCalculator class is not disturbed
public class OpenClosePrinciple {
    public static void main(String[] args){
        Shape s= new Rectangle(5,6);
        AreaCalculator areaCalculator= new AreaCalculator();
        System.out.println("area of rectangle is "+areaCalculator.areaCalculator(s));
//        Boolean.valueOf("true");
    }


}
interface Shape {
    public double areaCalculator();
}
class Rectangle implements Shape {
    public double length;
    public double breadth;
    Rectangle(double l, double b){
        this.length=l;
        this.breadth=b;
    }

    @Override
    public double areaCalculator() {
        return length*breadth;
    }
}

class AreaCalculator  {
    public  double areaCalculator(Shape s){
        return  s.areaCalculator();
    }
}
class Circle implements  Shape {
    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalculator() {
        return  (22/7)*radius*radius;
    }
}