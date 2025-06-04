package com.adobe.AdapterPattern2;

public interface CalculateInterface {
    public long getArea(Rectangle r);
}
class Calculator implements  CalculateInterface{
    Rectangle r;
//    Calculator(Rectangle r){
//        this .r= r;
//    }
    @Override
    public long getArea(Rectangle r) {
        this.r=r;
        System.out.println("r.length "+ r.length);
        System.out.println("r.width "+ r.width);
        return r.length*r.width;
    }
}