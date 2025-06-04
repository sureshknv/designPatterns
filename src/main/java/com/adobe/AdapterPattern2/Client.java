package com.adobe.AdapterPattern2;

public class Client {
    public static void main(String[] args){
        Triangle t= new Triangle(10,20);
        CalculateInterface calculateAdapter= new CalculatorAdapter(t);
       System.out.println("Area is "+ calculateAdapter.getArea(null));

    }
}
