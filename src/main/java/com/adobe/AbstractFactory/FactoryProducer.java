package com.adobe.AbstractFactory;

public class FactoryProducer {
public static AbstractFactory getFactory(String type){
    if(type.equalsIgnoreCase("shape")){
        return new ShapeFactory();
    }else if(type.equalsIgnoreCase("color")){
        return new ColorFactory();
    }else{
        return null;
    }
}
}
