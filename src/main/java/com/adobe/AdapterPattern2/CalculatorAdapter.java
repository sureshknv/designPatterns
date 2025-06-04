package com.adobe.AdapterPattern2;

public class CalculatorAdapter implements  CalculateInterface{
Calculator c;
Triangle t;
    CalculatorAdapter(Triangle t){
        this.t=t;
    }
    @Override
    public long getArea(Rectangle r) {
        c= new Calculator();

        Rectangle re= new Rectangle();
        re.length=t.base;
        re.width= (long)(0.5* t.height);
       return  c.getArea(re);
    }
}
