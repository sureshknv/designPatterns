package com.adobe.Factory;

public class CLient {

    public  static  void main(String[] args){
        AbstractShapeFactory ab= new RectangleFactory();
        Shape s= ab.getShape();
        // here we have not known anything about the rectangle class (Rectangle is completley abstracted by Shape)
        System.out.println("Area of rectangle is "+ s.calculateArea());
        ab= new CircleFactory();
        s= ab.getShape();
        System.out.println("Circle shape is "+ s.calculateArea());
    }
}
