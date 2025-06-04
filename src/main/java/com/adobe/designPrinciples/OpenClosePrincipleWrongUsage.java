package com.adobe.designPrinciples;
// this is explanation of open close principle in this if you look at the structure and the classes defined, everytime you need to change the class AreaCalculator
//when ever you add new data instead can we make an Shape interface  which has area function and that can be implemented by all the classes then from Areacalculator we just
// need to call area with the object.
public class OpenClosePrincipleWrongUsage {
    public  static void main(String[] args){
//        Rectangle r= new Rectangle(5,6);
//        Circle c= new Circle(5);
//        AreaCalculator ac=new AreaCalculator();
//        System.out.println("Area of rectangle "+ac.areaOfRectangle(r));
//        System.out.println("Area of circle "+ac.areaOfCircle(c));
//    }

}
//
//class Rectangle{
//    public double length;
//    public double breadth;
//    Rectangle(double l, double b){
//        this.length=l;
//        this.breadth=b;
//    }
//
//}
//
//class AreaCalculator{
//    public double areaOfRectangle(Rectangle r){
//        return r.length* r.breadth;
//    }
//    public double areaOfCircle(Circle c){
//        return (22/7)*c.radius*c.radius;
//    }
//}
//class Circle{
//    public double radius;
//    Circle(double radius){
//        this.radius=radius;
//    }

}