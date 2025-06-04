package com.adobe.AbstractFactory;

public class AbstractFactoryClient {
    public static void main(String[] args){
        AbstractFactory absf= FactoryProducer.getFactory("Color");
       Color c =absf.getColor("Red");
       c.fillColor();

    }
}
